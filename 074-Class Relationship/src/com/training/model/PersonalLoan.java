package com.training.model;

public class PersonalLoan extends Loan{

	public PersonalLoan(int loadId,  double loanAmount,  int duration,
			String startDate) {
		super(loadId, loanAmount, duration, startDate);
		}

	@Override
	public double getInterestRate() {
		return 15.0;
	}
	
	

}
