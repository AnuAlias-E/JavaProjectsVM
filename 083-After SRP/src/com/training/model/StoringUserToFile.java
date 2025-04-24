package com.training.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class StoringUserToFile {
	public void saveUser(User user) {

		OutputStream os = null;
		try {
			os = new FileOutputStream(user.getName() + ".txt");
			Writer writer = new OutputStreamWriter(os);
			writer.write("Name : " + user.getName() + "\n");
			writer.write("Email Id : " + user.getEmailId() + "\n");
			writer.write("Contact Number : " + user.getPhoneNumber() + "\n");

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
