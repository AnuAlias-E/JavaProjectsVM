package com.training.model.india;

import com.training.dp.Account;

class CurrentAccount implements Account {

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
		System.out.println("Current Account: Depositing Rs." + amount);
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Current Account: Withdrawing Rs." + amount);
		balance -= amount;
	}

	@Override
	public String toString() {
		return "Current Account [balance =Rs." + balance + "]";
	}

}
