package com.eta.example;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class TripActivity extends Activity {
	public final static String TRIPNAME = "com.eta.example.NAME";
	public final static String TRIPDESTINATION = "com.eta.example.DEST";
	public final static String TRIPTIME = "com.eta.example.TIME";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trip);
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
		getMenuInflater().inflate(R.menu.trip, menu);
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
	
	public void submit_trip(View view){
		Intent intent = new Intent(this, ShowActivity.class);
		EditText tripNameInput = (EditText) findViewById(R.id.trip_name_input);
		//EditText editText = (EditText) findViewById(R.id.trip_name_input);
		//EditText editText = (EditText) findViewById(R.id.trip_name_input);
		EditText tripTimeInput = (EditText) findViewById(R.id.trip_time_input);
		EditText tripDestInput = (EditText) findViewById(R.id.trip_destination_input);
		String tripName = tripNameInput.getText().toString();
		String tripTime = tripTimeInput.getText().toString();
		String tripDest = tripDestInput.getText().toString();

		intent.putExtra(TRIPNAME, tripName);
		intent.putExtra(TRIPTIME, tripTime);
		intent.putExtra(TRIPDESTINATION, tripDest);

		startActivity(intent);
	} 
	

}
