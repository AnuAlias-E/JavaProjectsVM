package com.training.task;

import com.training.model.InsuranceAccount;

public class InsuranceDepositingTask implements Runnable {

	InsuranceAccount insuranceAccount;

	public InsuranceDepositingTask(InsuranceAccount insuranceAccount) {
		super();
		this.insuranceAccount = insuranceAccount;
	}

	@Override
	public void run() {
		insuranceAccount.depositInsuranceAmount(50);
	}

}
