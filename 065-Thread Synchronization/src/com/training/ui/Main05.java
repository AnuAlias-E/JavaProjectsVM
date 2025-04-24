package com.training.ui;

import com.training.model.BankAccount;
import com.training.task.DepositingTask;
import com.training.task.WithdrawingTask;

public class Main05 {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Runnable runnable1 = new DepositingTask(account);
		Runnable runnable2 = new WithdrawingTask(account);

		Thread t1 = new Thread(runnable1, "DT");
		Thread t2 = new Thread(runnable2, "WT");
		t1.start();
		t2.start();
	}
}
