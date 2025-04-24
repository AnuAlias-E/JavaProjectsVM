package com.training.model;

import com.training.exception.NegativeValueException;

public class SavingAccount extends Account{

	
	
	public SavingAccount(String accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
	}

	@Override
	public double getInterestRate() {
		
		return 0.40;
	}
	
	public void applyInterestRate() {
		double interest=getBalance()*getInterestRate();
		dep
	}

	@Override
	public void deposit(double amount) throws NegativeValueException {
		if (amount < 0) {
			throw new NegativeValueException("Please enter positive amount");
		} else {
			this.account.setBalance(this.account.getBalance() + amount);
		}
		
	}

	@Override
	public void withdraw(double amount) throws NegativeValueException {
		// TODO Auto-generated method stub
		
	}

}
