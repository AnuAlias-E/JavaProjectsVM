package com.training.model;

public class PremiumDiscount implements Discount{

	@Override
	public double calculateDiscount(double amt) {
		return amt*.20;
	}

}
