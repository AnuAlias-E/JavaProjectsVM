package com.training.model.india;

import com.training.dp.Account;

class FixedDepositAccount implements Account {

	double balance;

	FixedDepositAccount() {
		super();
	}

	FixedDepositAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		System.out.println("Fixed Deposit Account: Depositing Rs." + amount);
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Fixed Deposit Account: Withdrawing Rs." + amount);
		balance -= amount;
	}

	@Override
	public String toString() {
		return "Fixed Deposit Account [balance =Rs." + balance + "]";
	}

}
