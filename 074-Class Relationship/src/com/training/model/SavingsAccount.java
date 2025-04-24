package com.training.model;

public class SavingsAccount implements Account {

	private String accountNo;
	private double balance;
	private double profit;

	public SavingsAccount(String accountNo, double balance, double profit) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.profit = profit;
	}

	@Override
	public String toString() {
		return "\nSavingsAccount [accountNo=" + accountNo + ", balance=" + balance + ", profit=" + profit + "]";
	}

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

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	@Override
	public void deposit(double amount) throws Exception {
		SimpleCalculator calculator = new SimpleCalculator();
		this.balance = calculator.add(this.balance, amount);
		this.balance = calculator.add(this.balance, profit);
		System.out.println("Savings Account Balance after deposit the amount " + amount);
		System.out.println("------------------------------");
		System.out.println("Balance Amount: " + this.balance);

	}

	@Override
	public void withDraw(double amount) throws Exception {
		SimpleCalculator calculator = new SimpleCalculator();
		this.balance = calculator.subtract(this.balance, amount);
		System.out.println("Savings Account Balance after withdrawing the amount " + amount);
		System.out.println("------------------------------");
		System.out.println("Balance Amount: " + this.balance);
	}

}
