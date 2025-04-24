package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.BillItem;

public class Main15 {
public static void main(String[] args) {
	List<BillItem> billItems = new LinkedList<>();
	billItems.add( new BillItem("Redmi", 3, 14000.00));
	billItems.add(new BillItem("Samsung", 2, 15000.00));
	billItems.add(new BillItem("OPPO", 4, 20000.00));
	billItems.add(new BillItem("IPhone", 4, 24000.00));
	
	double totalValue=billItems
							.stream()
							.map(bi->bi.getItemValue())
							.reduce(0.0, (bi1,bi2)->bi1+bi2);
	System.out.println(totalValue);
}
}
