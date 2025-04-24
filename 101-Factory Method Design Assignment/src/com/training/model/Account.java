package com.training.model;

public interface Account {
	void setBalance(double balanceAmt);

	void withdraw(double withdrawAmt);

	void deposit(double depositAmt);
}
