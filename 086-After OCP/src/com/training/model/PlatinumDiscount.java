package com.training.model;

public class PlatinumDiscount implements Discount{

	@Override
	public double calculateDiscount(double amt) {
		
		return amt*0.30;
	}

}
