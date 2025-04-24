package com.training.dp;

public class Pen implements Product {
	Product product;

	public Pen(Product product) {
		this.product = product;
	}

	@Override
	public double getPrice() {
		if (this.product == null)
			return 100;
		else {
			return 100 + this.product.getPrice();
		}
	}

	@Override
	public double getDiscount() {

		return 10;
	}

}
