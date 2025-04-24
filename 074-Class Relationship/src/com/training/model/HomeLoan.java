package com.training.model;

public class HomeLoan extends Loan {

	public HomeLoan(int loadId,  double loanAmount, int duration,
			String startDate) {
		super(loadId,  loanAmount, duration, startDate);
	}

	@Override
	public double getInterestRate() {
		return 10.0;
	}

}
