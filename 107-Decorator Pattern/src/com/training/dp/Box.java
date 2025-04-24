package com.training.dp;

public class Box implements Product {
	Product product;

	public Box(Product product) {
		super();
		this.product = product;
	}

	@Override
	public double getPrice() {
		if (this.product == null)
			return 200;
		else {
			return 200 + this.product.getPrice();
		}
	}

	@Override
	public double getDiscount() {
		if (this.product == null)
			return 20;
		else {
			return 20 + this.product.getDiscount();
		}
	}

}
