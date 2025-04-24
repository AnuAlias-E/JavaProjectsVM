package com.training.model;

public class Account {
int id;
String accountHolderName;
double balance;
String typeOfAccount;


public Account() {
	super();
}


public Account(int id, String accountHolderName, double balance, String typeOfAccount) {
	super();
	this.id = id;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
	this.typeOfAccount = typeOfAccount;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getAccountHolderName() {
	return accountHolderName;
}


public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}


public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}


public String getTypeOfAccount() {
	return typeOfAccount;
}


public void setTypeOfAccount(String typeOfAccount) {
	this.typeOfAccount = typeOfAccount;
}


@Override
public String toString() {
	return "\nAccount [id=" + id + ", accountHolderName=" + accountHolderName + ", balance=" + balance
			+ ", typeOfAccount=" + typeOfAccount + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Account))
		return false;
	Account other = (Account) obj;
	if (id != other.id)
		return false;
	return true;
}




}
