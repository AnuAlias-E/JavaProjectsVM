package com.training.model;

public class WhatsAppNotification {
	public void sendWhastsAppNotification(User user) {
		System.out.println("Sending Whatsapp Message to the : " + user.getPhoneNumber());
	}
}
