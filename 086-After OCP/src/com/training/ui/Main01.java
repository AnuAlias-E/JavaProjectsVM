package com.training.ui;

import com.training.model.DiscountCalculator;
import com.training.model.GoldenDiscount;
import com.training.model.PlatinumDiscount;
import com.training.model.PremiumDiscount;
import com.training.model.RegularDiscount;

public class Main01 {
	public static void main(String[] args) {
		DiscountCalculator calculator = new DiscountCalculator();
		double discountforRegular = calculator.calculateDiscount(new RegularDiscount(), 100);
		double discountforPremium = calculator.calculateDiscount(new PremiumDiscount(), 100);
		double discountforPlatinum = calculator.calculateDiscount(new PlatinumDiscount(), 100);
		double discountforGolden = calculator.calculateDiscount(new GoldenDiscount(), 100);
		
		System.out.println("Discount For Regular : " + discountforRegular);
		System.out.println("Discount For Premium : " + discountforPremium);
		System.out.println("Discount For Platinum : " + discountforPlatinum);
		System.out.println("Discount For Golden : " + discountforGolden);
	}
}
