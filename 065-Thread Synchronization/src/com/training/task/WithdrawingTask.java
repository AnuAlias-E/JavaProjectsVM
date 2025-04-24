package com.training.task;

import com.training.model.BankAccount;

public class WithdrawingTask implements Runnable {
	BankAccount account;

	public WithdrawingTask(BankAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(20.00);

	}

}
