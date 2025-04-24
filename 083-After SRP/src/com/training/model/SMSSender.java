package com.training.model;

public class SMSSender {

	public void sendSMS(User user) {
		System.out.println("Sending SMS to the : " + user.getPhoneNumber());
	}
}
