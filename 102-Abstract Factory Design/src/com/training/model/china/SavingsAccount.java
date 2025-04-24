package com.training.model.china;

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
		System.out.println("Savings Account: Depositing YUAN " + amount);
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Savings Account: Withdrawing YUAN " + amount);
		balance -= amount;
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance =YUAN " + balance + "]";
	}

}
