package com.training.dp;

public class GiftPack implements Product {

	Product product;

	public GiftPack(Product product) {
		super();
		this.product = product;
	}

	@Override
	public double getPrice() {
		if (this.product == null)
			return 500;
		else {
			return 500 + this.product.getPrice();
		}
	}

	@Override
	public double getDiscount() {
		if (this.product == null)
			return 50;
		else {
			return 50 + this.product.getDiscount();
		}
	}

}
