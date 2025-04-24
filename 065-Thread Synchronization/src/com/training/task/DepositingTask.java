package com.training.task;

import com.training.model.BankAccount;

public class DepositingTask implements Runnable {

	BankAccount account;

	public DepositingTask(BankAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		account.deposit(35.00);

	}

}
