package com.training.dp;

public class NotificationSystem {
	public void sendEmail(User user, int ticketNo) {
		System.out.println("Sending email to " + user.getName());
	}

	public void sendSMS(User user, int ticketNo) {
		System.out.println("Sending SMS to " + user.getContactNumber());
	}
}
