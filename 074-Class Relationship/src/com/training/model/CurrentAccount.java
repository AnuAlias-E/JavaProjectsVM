package com.training.model;

public class CurrentAccount implements Account {

	private String accountNo;
	private double balance;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) throws Exception {
		SimpleCalculator calculator = new SimpleCalculator();
		this.balance = calculator.add(this.balance, amount);

		System.out.println("------------------------------");
		System.out.println("Current Account Balance after deposit the amount " + amount);
		System.out.println("------------------------------");
		System.out.println("Balance Amount: " + this.balance);
		System.out.println("------------------------------");

	}

	@Override
	public void withDraw(double amount) throws Exception {
		SimpleCalculator calculator = new SimpleCalculator();
		this.balance = calculator.subtract(this.balance, amount);
		System.out.println("------------------------------");
		System.out.println("Current Account Balance after deposit the amount " + amount);
		System.out.println("------------------------------");
		System.out.println("Balance Amount : " + this.balance);
		System.out.println("------------------------------");
	}

	@Override
	public String toString() {
		return "\nCurrentAccount [accountNo=" + accountNo + ", balance=" + balance + "]";
	}

}
