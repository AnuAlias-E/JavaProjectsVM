package com.training.model;

public class Contact {
String emailId;
String phoneNo;
public Contact(String emailId, String phoneNo) {
	super();
	this.emailId = emailId;
	this.phoneNo = phoneNo;
}
@Override
public String toString() {
	return "Contact [emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
}


}
