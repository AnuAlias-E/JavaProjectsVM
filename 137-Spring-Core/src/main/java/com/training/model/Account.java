package com.training.model;

public class Account {
	int accId;
	double balance;
	String type;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "\nAccount [accId=" + accId + ", balance=" + balance + ", type=" + type + "]";
	}

}
