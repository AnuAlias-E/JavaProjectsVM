package com.training.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class User {
	private String name;

	private String emailId;
	private String phoneNumber;

	public User() {
		super();
	}

	public User(String name, String emailId, String phoneNumber) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	public void sendEmail() {
		System.out.println("Sending email to the : " + emailId);
	}

	public void sendSMS() {
		System.out.println("Sending SMS to the : " + phoneNumber);
	}

	public void saveUser() {

		OutputStream os = null;
		try {
			os = new FileOutputStream(name + ".txt");
			Writer writer = new OutputStreamWriter(os);
			writer.write("Name : " + this.name + "\n");
			writer.write("Email Id : " + this.emailId + "\n");
			writer.write("Contact Number : " + this.phoneNumber + "\n");

			writer.flush();
			writer.close();
			os.close();

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
