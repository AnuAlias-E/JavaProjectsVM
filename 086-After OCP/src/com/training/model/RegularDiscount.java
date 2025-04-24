package com.training.model;

public class RegularDiscount implements Discount {

	@Override
	public double calculateDiscount(double amt) {
		
		return amt*0.10;
	}

}
