package com.training.model;

public class GoldenDiscount implements Discount {

	@Override
	public double calculateDiscount(double amt) {
		return amt*.50;
	}

}
