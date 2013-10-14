package com.eta.example;
import java.util.UUID;

public class Trip {
	private UUID mTripId;
	private String mTripName;
	private String mDate;
	private String mDest;
	
	public Trip(){
		mTripId = UUID.randomUUID();
		mTripName = new String();
		mDate = new String();
		//mLocationId = new Location();
	}
	public Trip(String mName, String mDate, String mDest){
		this.mTripId = UUID.randomUUID();
		this.mTripName = mName;
		this.mDate = mDate;
		this.mDest = mDest;
		//this.people = people;
	}
	public String getTripName(){
		return mTripName;
	}
	public String getTripDest(){
		return mDest;
	}
	public String getDate(){
		return mDate;
	}
	

}
