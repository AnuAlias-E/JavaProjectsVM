package com.training.model;

public class Contact {
private String emailId;
private String phoneNumber;

public Contact() {
	super();
}

public Contact(String emailId, String phoneNumber) {
	super();
	this.emailId = emailId;
	this.phoneNumber = phoneNumber;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

@Override
public String toString() {
	return "Contact [emailId=" + emailId + ", phoneNumber=" + phoneNumber + "]";
}


}
