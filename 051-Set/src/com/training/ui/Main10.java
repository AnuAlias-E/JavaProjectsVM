package com.training.ui;

import java.util.Set;
import java.util.TreeSet;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;

public class Main10 {
public static void main(String[] args) {
	BillItemPriceComparator priceComparator = new BillItemPriceComparator();
	Set<BillItem> billItemsSet = new TreeSet<>(priceComparator);
	billItemsSet.add(new BillItem("Dell", 4, 1000.00));
	billItemsSet.add(new BillItem("Iphone", 6, 40000.00));
	billItemsSet.add(new BillItem("Samsung", 4, 300.00));
	billItemsSet.add(new BillItem("Redmi", 8, 23000.00));
	billItemsSet.add(new BillItem("Oppo", 7, 30000.00));

	System.out.println("Size: " + billItemsSet.size());
	System.out.println(billItemsSet);
}
}
