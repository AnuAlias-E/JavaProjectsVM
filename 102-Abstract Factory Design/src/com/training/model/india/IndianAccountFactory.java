package com.training.model.india;

import com.training.dp.Account;
import com.training.dp.AccountCreator;

public class IndianAccountFactory implements AccountCreator {

	@Override
	public Account createAccount(String type) {
		Account account = null;
		if (type.equalsIgnoreCase("Savings")) {
			account = new SavingsAccount();
		}
		if (type.equalsIgnoreCase("current")) {
			account = new CurrentAccount();
		}
		if (type.equalsIgnoreCase("fixed")) {
			account = new FixedDepositAccount();
		}
		return account;
	}

}
