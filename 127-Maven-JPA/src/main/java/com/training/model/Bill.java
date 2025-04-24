package com.training.model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "bills")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column
	String customerName;

	@Column
	LocalDate billingDate;

	@ElementCollection
	@CollectionTable(name = "bill_items")
	@OrderColumn(name = "idx")
	List<BillItem> billitems;

	public Bill(String customerName, LocalDate billingDate) {
		super();
		this.customerName = customerName;
		this.billingDate = billingDate;
		this.billitems = new LinkedList<>();
	}

	public Bill() {
		super();
		this.billitems = new LinkedList<>();
	}

	public void addBillItem(BillItem billItem) {
		this.billitems.add(billItem);
	}

	public void removeBillItem(BillItem billItem) {
		this.billitems.remove(billItem);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}

	public List<BillItem> getBillitems() {
		return billitems;
	}

	public void setBillitems(List<BillItem> billitems) {
		this.billitems = billitems;
	}

	@Override
	public String toString() {
		return "\nBill [id=" + id + ", customerName=" + customerName + ", billingDate=" + billingDate + ", billitems="
				+ billitems + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Bill))
			return false;
		Bill other = (Bill) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
