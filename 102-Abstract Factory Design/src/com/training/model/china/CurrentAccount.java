package com.training.model.china;

import com.training.dp.Account;

public class CurrentAccount implements Account {

	double balance;

	CurrentAccount() {
		super();
	}

	CurrentAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		System.out.println("Current Account: Depositing YUAN " + amount);
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Current Account: Withdrawing YUAN " + amount);
		balance -= amount;
	}

	@Override
	public String toString() {
		return "Current Account [balance=YUAN " + balance + "]";
	}

}
