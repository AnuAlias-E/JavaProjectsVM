package com.training.task;

import com.training.model.InsuranceAccount;

public class InsuranceWithdrawingTask implements Runnable {

	InsuranceAccount insuranceAccount;

	public InsuranceWithdrawingTask(InsuranceAccount insuranceAccount) {
		super();
		this.insuranceAccount = insuranceAccount;
	}

	@Override
	public void run() {

		insuranceAccount.withdrawInsuranceAmount(30);

	}

}
