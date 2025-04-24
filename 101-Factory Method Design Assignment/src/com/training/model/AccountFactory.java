package com.training.model;

public class AccountFactory {

	private String accType;

	public AccountFactory() {
		super();
	}

	public AccountFactory(String accType) {
		super();
		this.accType = accType;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Account createAccount() {
		Account account = null;
		if (accType.equalsIgnoreCase("Savings"))
			account = new SavingsAccount();

		if (accType.equalsIgnoreCase("Current"))
			account = new CurrentAccount();

		if (accType.equalsIgnoreCase("Fixed"))
			account = new FixedDepositAccount();

		return account;
	}
}
