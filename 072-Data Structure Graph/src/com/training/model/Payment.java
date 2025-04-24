package com.training.model;

public class Payment implements Comparable<Payment> {
	String month;
	double paymentAmount;

	public Payment(String month, double paymentAmount) {
		super();
		this.month = month;
		this.paymentAmount = paymentAmount;
	}

	@Override
	public int compareTo(Payment o) {
		if (this.paymentAmount < o.paymentAmount)
			return -1;
		if (this.paymentAmount > o.paymentAmount)
			return 1;
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(paymentAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Payment))
			return false;
		Payment other = (Payment) obj;
		if (Double.doubleToLongBits(paymentAmount) != Double.doubleToLongBits(other.paymentAmount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nPayment [month=" + month + ", paymentAmount=" + paymentAmount + "]";
	}
	
	

}
