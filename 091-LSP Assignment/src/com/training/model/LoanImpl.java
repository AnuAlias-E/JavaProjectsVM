package com.training.model;

public abstract class LoanImpl implements Loan {

	private double loanAmt;
	private int tenure;

	public LoanImpl(double loanAmt, int tenure) {
		super();
		this.loanAmt = loanAmt;
		this.tenure = tenure;
	}

	public double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public abstract double getInterestRate();

	@Override
	public void printLoanDetails() {
		System.out.println("Loan Amount: " + this.getLoanAmt());
		System.out.println("Loan Tenure: " + this.getTenure());
		System.out.println("Loan Interest Rate: " + getInterestRate());
		System.out.println("Loan Interest Amount: " + getInterestAmount());
		System.out.println("Loan Total Repayment Amount: " + getTotalRepayable());

	}

}
