package com.training.ui;

import com.training.model.InsuranceAccount;
import com.training.task.InsuranceDepositingTask;
import com.training.task.InsuranceWithdrawingTask;

public class Main06 {
	public static void main(String[] args) {
		InsuranceAccount insuranceAccount = new InsuranceAccount();
		Runnable runnable1 = new InsuranceDepositingTask(insuranceAccount);
		Runnable runnable2 = new InsuranceWithdrawingTask(insuranceAccount);

		Thread t1 = new Thread(runnable1, "IDT");
		Thread t2 = new Thread(runnable2, "IWT");
		t1.start();
		t2.start();
	}
}
