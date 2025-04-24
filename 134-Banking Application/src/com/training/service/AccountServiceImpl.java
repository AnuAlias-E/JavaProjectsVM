package com.training.service;

import com.training.exception.NegativeValueException;
import com.training.model.Account;

public class AccountServiceImpl implements AccountService {
	private Account account;

	public AccountServiceImpl() {
		super();
	}

	public AccountServiceImpl(Account account) {
		super();
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
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
		if (amount < 0) {
			throw new NegativeValueException("Please enter positive amount");
		} else {
			if (this.account.getBalance() > amount) {
				this.account.setBalance(this.account.getBalance() - amount);
			} else {
				throw new InSufficientFundsException("Insufficient Fund in the Account");
			}
		}

	}

}
