package com.training.model;

public abstract class Loan {
//
	// add getInterestRate abstract
	// getInterestAmount()
	// getTotalRepayable
	// getEMI

	private int loadId;
	private double loanAmount;
	private int duration;
	private String startDate;

	public Loan(int loadId, double loanAmount, int duration, String startDate) {
		super();
		this.loadId = loadId;
		this.loanAmount = loanAmount;
		this.duration = duration;
		this.startDate = startDate;
	}

	public int getLoadId() {
		return loadId;
	}

	public void setLoadId(int loadId) {
		this.loadId = loadId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Loan [loadId=" + loadId + ", loanAmount=" + loanAmount + ", duration=" + duration + ", startDate="
				+ startDate + "]";
	}

	public abstract double getInterestRate();

	public double getInterestAmount() {
		SimpleCalculator calculator = new SimpleCalculator();
		double interestAmount = calculator.multiply(this.loanAmount, calculator.divide(this.getInterestRate(), 100));
		interestAmount = calculator.multiply(interestAmount, this.duration);
		return interestAmount;
	}

	public double getTotalRepayable() {
		SimpleCalculator calculator = new SimpleCalculator();
		return calculator.add(loanAmount, this.getInterestAmount());

	}

	public double getEMI() {
		SimpleCalculator calculator = new SimpleCalculator();
		return calculator.divide(this.getTotalRepayable(), calculator.multiply(12, duration));

	}

}
