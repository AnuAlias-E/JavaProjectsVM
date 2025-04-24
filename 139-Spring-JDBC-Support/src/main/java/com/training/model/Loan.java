package com.training.model;

public class Loan {

	int id;
	String customerName;
	double loanAmount;
	int tenure;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "\nLoan [id=" + id + ", customerName=" + customerName + ", loanAmount=" + loanAmount + ", tenure="
				+ tenure + "]";
	}

}
