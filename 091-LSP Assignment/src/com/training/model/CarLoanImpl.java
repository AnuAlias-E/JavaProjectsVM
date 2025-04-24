package com.training.model;

public class CarLoanImpl extends LoanImpl {

	private String registerNumber;

	public CarLoanImpl(double loanAmt, int tenure, String registerNumber) {
		super(loanAmt, tenure);
		this.registerNumber = registerNumber;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	@Override
	public double getInterestRate() {
		return 0.40;

	}

	@Override
	public double getInterestAmount() {
		double interestAmount = this.getLoanAmt() * this.getTenure() * this.getInterestRate();
		return interestAmount;
	}

	@Override
	public double getTotalRepayable() {
		return this.getLoanAmt() + this.getInterestAmount();
	}

	@Override
	public void printLoanDetails() {
		System.out.println("Car Loan Details");
		System.out.println("-------------------------------------------");
		super.printLoanDetails();
		System.out.println("Register Number: " + this.registerNumber);
	}

}
