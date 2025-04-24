package com.training.ui;

import com.training.model.User;

public class Main01 {
	public static void main(String[] args) {
		User user1 = new User("anu", "anu@gmail.com", "234875787834");
		user1.saveUser();
		user1.sendEmail();
		user1.sendSMS();
	}
}
