package com.training.model;

class FixedDepositAccount implements Account {

	private double balance;

	FixedDepositAccount() {
		super();
	}

	@Override
	public void setBalance(double balanceAmt) {
		this.balance = balanceAmt;
		System.out.println("FixedDeposit Account");
		System.out.println("----------------------------------------");
		System.out.println("Balance : " + balance);

	}

	@Override
	public void withdraw(double withdrawAmt) {
		this.balance -= withdrawAmt;
		System.out.println("Withdraw the amount " + withdrawAmt);
		System.out.println("Balance : " + balance);
	}

	@Override
	public void deposit(double depositAmt) {
		this.balance += depositAmt;
		System.out.println("Deposit the amount " + depositAmt);
		System.out.println("Balance : " + balance);
	}

	public FixedDepositAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "FixedDepositAccount [balance=" + balance + "]";
	}

}
