package com.training.model;

public class HomeLoanImpl extends LoanImpl {

	private String propertyLocation;

	public HomeLoanImpl(double loanAmt, int tenure, String propertyLocation) {
		super(loanAmt, tenure);
		this.propertyLocation = propertyLocation;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	@Override
	public double getInterestRate() {
		return 0.15;

	}

	@Override
	public double getInterestAmount() {

		double interestAmount = this.getLoanAmt() * this.getTenure() * this.getInterestRate();
		return interestAmount;
	}

	@Override
	public void printLoanDetails() {
		System.out.println("Home Loan Details");
		System.out.println("-------------------------------------------");
		super.printLoanDetails();
		System.out.println("Property Location: " + propertyLocation);
	}

	@Override
	public double getTotalRepayable() {
		return this.getLoanAmt() + this.getInterestAmount();
	}

}
