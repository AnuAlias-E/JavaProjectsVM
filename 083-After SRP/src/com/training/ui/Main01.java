package com.training.ui;

import com.training.model.EmailSender;
import com.training.model.SMSSender;
import com.training.model.StoringUserToFile;
import com.training.model.User;
import com.training.model.WhatsAppNotification;

public class Main01 {
	public static void main(String[] args) {
		User user1 = new User("anu", "anu@gmail.com", "234875787834");
		StoringUserToFile storingUserData = new StoringUserToFile();
		storingUserData.saveUser(user1);
		EmailSender emailSender = new EmailSender();
		emailSender.sendEmail(user1);
		SMSSender smsSender = new SMSSender();
		smsSender.sendSMS(user1);
		
		WhatsAppNotification notification= new WhatsAppNotification();
		notification.sendWhastsAppNotification(user1);
	}
}
