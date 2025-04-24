package com.training.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Bill implements Serializable {
	private int billNo;
	private String customerName;
	private Set<BillItem> billItems;

	public Bill(int billNo, String customerName) {
		super();
		this.billNo = billNo;
		this.customerName = customerName;
		this.billItems = new HashSet<>();
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Set<BillItem> getBillItems() {
		return billItems;
	}

	public void setBillItems(Set<BillItem> billItems) {
		this.billItems = billItems;
	}

	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", customerName=" + customerName + ", billItems=" + billItems + "]";
	}

	public void addBill(String name, int quantity, double price) {
		BillItem billItem = new BillItem(name, quantity, price);
		this.billItems.add(billItem);
	}

	public void printBill() {

		System.out.println("Bill Number : " + this.billNo);
		System.out.println("Customer Name : " + this.customerName);
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		System.out.println("Sl No\t\tItem Name\t\tQuantity\t\tPrice\t\tItem Vlaue");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		int slNo = 1;
		double totalBillAmount = 0.00;

		for (BillItem billItem : this.billItems) {

			System.out.println(slNo++ + "\t\t" + billItem.getItemName() + "\t\t\t" + billItem.getQuantity() + "\t\t\t"
					+ billItem.getPrice() + "\t\t" + billItem.getItemValue());

			totalBillAmount += billItem.getItemValue();

		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		System.out.println("TOTAL BILL Amount : " + totalBillAmount);
	}

}
