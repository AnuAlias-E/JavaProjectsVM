package com.training.model;

class SavingsAccount implements Account {
	private double balance;

	SavingsAccount() {
		super();
	}

	@Override
	public void setBalance(double balanceAmt) {
		this.balance = balanceAmt;
		System.out.println("Savings Account");
		System.out.println("----------------------------------------");
		System.out.println("Balance : " + balance);

	}

	@Override
	public void withdraw(double withdrawAmt) {
		this.balance -= withdrawAmt;
		System.out.println("Withdraw the amount: " + withdrawAmt);
		System.out.println("Balance : " + balance);

	}

	@Override
	public void deposit(double depositAmt) {
		this.balance += depositAmt;
		System.out.println("Deposit the amount : " + depositAmt);
		System.out.println("Balance : " + balance);
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + "]";
	}

}
