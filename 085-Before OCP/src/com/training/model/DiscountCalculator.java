package com.training.model;

public class DiscountCalculator {
	public double calculateDiscount(String customerType, double amount) {
		double discount = 0.0;

		if (customerType.equalsIgnoreCase("Regular"))
			discount = amount * 0.10;
		if (customerType.equalsIgnoreCase("Premium"))
			discount = amount * 0.20;
		if (customerType.equalsIgnoreCase("Platinum"))
			discount = amount * 0.30;
		return discount;
	}
}
