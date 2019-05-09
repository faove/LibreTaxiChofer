package com.libre.taxi.chofer;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Chronometer.OnChronometerTickListener;

public class LibreTaxiChoferActivity extends android.support.v4.app.FragmentActivity implements OnChronometerTickListener {
	Chronometer chronometer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_libre_taxi_chofer);
		chronometer = (Chronometer)findViewById(R.id.chronometer1);		
		chronometer.setOnChronometerTickListener(this);
		chronometer.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.libre_taxi_chofer, menu);
		return true;
	}

	@Override
	public void onChronometerTick(Chronometer arg0) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				CharSequence text = chronometer.getText();
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
				Date start = null,end = null;
				
				try {
					start = sdf.parse(text.toString());
					end   = sdf.parse("00:01");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				long difference = end.getTime() - start.getTime();
				
				if (start.getMinutes() > end.getMinutes()){
				//CharSequence text = chronometer.getText();
		        //if (text "00:15") {
		            
				//if (chronometer.getText() > 00:10) {
					
					chronometer.stop();
		            // Create Intent and start the new Activity here
					Intent intent = new Intent(LibreTaxiChoferActivity.this, BuscarUserActivity.class);
		    		//startActivityForResult
		    		//startActivityForResult(intent,PICK_CONTACT);
		    		startActivity(intent);
		        }
	}

}
