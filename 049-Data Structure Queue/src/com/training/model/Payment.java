package com.training.model;

public class Payment implements Comparable<Payment> {
	String month;
	double paymentAmount;

	@Override
	public int compareTo(Payment o) {
		if (this.paymentAmount < o.paymentAmount)
			return -1;
		if (this.paymentAmount > o.paymentAmount)
			return 1;
		return 0;
	}

}
