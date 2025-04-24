package com.training.model;

public class EmailSender {
	public void sendEmail(User user) {
		System.out.println("Sending email to the : " + user.getEmailId());
	}
}
