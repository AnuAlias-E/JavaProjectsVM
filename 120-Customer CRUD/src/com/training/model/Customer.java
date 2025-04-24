package com.training.model;

public class Customer {
 private int customerId;
 private String name;
 private double balance;
 private String email;
 private String phoneNo;
 
 
public Customer() {
	super();
}


public Customer(int customerId, String name, double balance, String email, String phoneNo) {
	super();
	this.customerId = customerId;
	this.name = name;
	this.balance = balance;
	this.email = email;
	this.phoneNo = phoneNo;
}


public int getCustomerId() {
	return customerId;
}


public void setCustomerId(int customerId) {
	this.customerId = customerId;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}




public String getPhoneNo() {
	return phoneNo;
}


public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}


@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", name=" + name + ", balance=" + balance + ", email=" + email
			+ ", phoneNo=" + phoneNo + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + customerId;
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Customer))
		return false;
	Customer other = (Customer) obj;
	if (customerId != other.customerId)
		return false;
	return true;
}
 
 
}
