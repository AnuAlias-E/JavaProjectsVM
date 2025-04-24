package com.training.model;

import java.io.Serializable;

public class BillItem implements Comparable<BillItem>, Serializable {
	private String itemName;
	private int quantity;
	private double price;

	public BillItem(String itemName, int quantity, double price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nBillItem [itemName=" + itemName + ", quantity=" + quantity + ", price=" + price + ", ItemValue="
				+ getItemValue() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BillItem))
			return false;
		BillItem other = (BillItem) obj;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		return true;
	}

	public double getItemValue() {
		return this.price * this.quantity;
	}

	@Override
	public int compareTo(BillItem o) {
		return this.itemName.compareTo(o.itemName);
	}

}
