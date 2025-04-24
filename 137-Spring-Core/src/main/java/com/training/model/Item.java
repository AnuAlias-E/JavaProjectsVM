package com.training.model;

import java.util.Arrays;

public class Item {
	private String itemName;
	private double[] priceHistory;
	private double price;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double[] getPriceHistory() {
		return priceHistory;
	}

	public void setPriceHistory(double[] priceHistory) {
		this.priceHistory = priceHistory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", priceHistory=" + Arrays.toString(priceHistory) + ", price=" + price
				+ "]";
	}

}
