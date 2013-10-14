package com.eta.example;

import java.util.UUID;

public class Location {
	private UUID mLocationId;
	private String mLocationName;
	
	public Location(){
		mLocationId = UUID.randomUUID();
		mLocationName = new String();
	}
}
