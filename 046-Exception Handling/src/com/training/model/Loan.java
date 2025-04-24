package com.training.model;

import com.training.model.exception.InvalidAmountException;
import com.training.model.exception.InvalidCustomerNameException;
import com.training.model.exception.InvalidLoanIdException;
import com.training.model.exception.InvalidTenureException;

public class Loan {
	private int loadId;
	private String customerName;
	private double loanAmount;
	private int tenure;
	
	public Loan() {
		super();
	}
	public Loan(int loadId, String customerName, double loanAmount, int tenure) throws InvalidCustomerNameException {
		super();
		setLoadId(loadId);
		setCustomerName(customerName);
		setLoanAmount(loanAmount);
		setTenure(tenure);
	}
	public int getLoadId() {
		return loadId;
	}
	public void setLoadId(int loadId) {
		if(loadId<0) {
			InvalidLoanIdException e= new InvalidLoanIdException("Invalid Loan Id: "+loadId+" Please enter a positive value");
			throw e;
		}
		this.loadId = loadId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) throws InvalidCustomerNameException {
		if(customerName == null || customerName.length()==0) {
		InvalidCustomerNameException e= new InvalidCustomerNameException("Name cannot be null or should have 1 character");
		throw e;
		}
		this.customerName = customerName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		if(loanAmount<0) {
			InvalidAmountException e= new InvalidAmountException("Invalid Loan Amount: "+loanAmount+" Please enter a positive value");
			throw e;
		}
		this.loanAmount = loanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		if(tenure<0) {
			InvalidTenureException e= new InvalidTenureException("Invalid Tenure: "+tenure+" Please enter a positive value");
			throw e;
		}
		this.tenure = tenure;
	}
	
}
