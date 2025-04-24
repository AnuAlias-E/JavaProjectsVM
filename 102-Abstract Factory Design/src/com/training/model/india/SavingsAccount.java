package com.training.model.india;

import com.training.dp.Account;

class SavingsAccount implements Account {
	double balance;

	SavingsAccount() {
		super();
	}

	SavingsAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		System.out.println("Savings Account: Depositing Rs." + amount);
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Savings Account: Withdrawing Rs." + amount);
		balance -= amount;
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance =Rs." + balance + "]";
	}

}
