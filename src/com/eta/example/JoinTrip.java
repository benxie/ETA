package com.eta.example;

import java.util.UUID;

public class JoinTrip {

	private UUID mTripId;
	private UUID mPeopleId;
	private String mEstimatedTime;
	public JoinTrip(UUID mTid, UUID mPid, String mTime){
		mTripId = mTid;
		mPeopleId = mPid;
		mEstimatedTime = mTime;
	}
}
