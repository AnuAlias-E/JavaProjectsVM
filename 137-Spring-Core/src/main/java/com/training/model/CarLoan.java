package com.training.model;

public class CarLoan implements Loan{

	double loanAmt;
	@Override
	public void setLoanAmount(double amount) {
		this.loanAmt=amount;
		
	}

	@Override
	public double getInterestAmount() {
		
		return this.loanAmt*12*15.00/100.00;
	}

	public double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}

	@Override
	public String toString() {
		return "\nCarLoan [loanAmt=" + loanAmt + "]";
	}

}
