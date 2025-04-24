package com.training.ui;

import com.training.model.DiscountCalculator;

public class Main01 {
	public static void main(String[] args) {
		DiscountCalculator calculator = new DiscountCalculator();
		double discountforRegular = calculator.calculateDiscount("Regular", 100);
		double discountforPremium = calculator.calculateDiscount("Premium", 100);
		double discountforPlatinum = calculator.calculateDiscount("Platinum", 100);
		System.out.println("Discount For Regular : " + discountforRegular);
		System.out.println("Discount For Premium : " + discountforPremium);
		System.out.println("Discount For Platinum : " + discountforPlatinum);
	}
}
