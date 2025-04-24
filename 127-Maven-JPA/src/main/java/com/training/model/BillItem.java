package com.training.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BillItem {
	int slNo;
	@Column
	String itemName;
	@Column
	int quantity;
	@Column
	double price;

	public BillItem(int slNo, String itemName, int quantity, double price) {
		super();
		this.slNo = slNo;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public BillItem() {
		super();
	}

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
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
		return "\nBillItem [slNo=" + slNo + ", itemName=" + itemName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + slNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BillItem))
			return false;
		BillItem other = (BillItem) obj;
		if (slNo != other.slNo)
			return false;
		return true;
	}

}
