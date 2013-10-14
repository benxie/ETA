package com.eta.example;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ShowActivity extends Activity {
    public final static String a = "haha";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
	    
		String Tname = intent.getStringExtra(TripActivity.TRIPNAME);	   
	    String Ttime = intent.getStringExtra(TripActivity.TRIPTIME);	    
	    String Tdest = intent.getStringExtra(TripActivity.TRIPDESTINATION);

	    Trip trip = new Trip(Tname, Ttime, Tdest);

	    TextView tripName = new TextView(this);
	    TextView tripTime = new TextView(this);	    
	    TextView tripDestination = new TextView(this);
	    
	    tripName.setText(trip.getTripName());
	    tripTime.setText(trip.getDate());
	    tripDestination.setText(trip.getTripDest());
	    
		setContentView(R.layout.activity_show);	   	    
	    
	    LinearLayout nameLayout = (LinearLayout) findViewById(R.id.nameLayout);
	    nameLayout.addView(tripName);
	    
	    LinearLayout timeLayout = (LinearLayout) findViewById(R.id.timeLayout);
	    timeLayout.addView(tripTime);
	    
	    LinearLayout destLayout = (LinearLayout) findViewById(R.id.destinationLayout);
	    destLayout.addView(tripDestination);
	    
	    
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
