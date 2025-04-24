package com.training.ui;

import java.util.Set;
import java.util.TreeSet;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;
import com.training.model.comparators.BillItemQuantityComparator;

public class Main06 {
	public static void main(String[] args) {
		Set<BillItem> billItemsSet = new TreeSet<>();
		billItemsSet.add(new BillItem("Dell", 4, 1000.00));
		billItemsSet.add(new BillItem("Iphone", 6, 40000.00));
		billItemsSet.add(new BillItem("Samsung", 4, 300.00));
		billItemsSet.add(new BillItem("Redmi", 8, 23000.00));
		billItemsSet.add(new BillItem("Oppo", 7, 30000.00));
		billItemsSet.add(new BillItem("IBM", 3, 60000.00));

		billItemsSet
				.stream()
				.mapToInt(bi -> bi.getQuantity())
				.forEach(q -> System.out.println(q));

		System.out.println("-------------------------");

		billItemsSet
				.stream()
				.sorted(new BillItemPriceComparator())
				.forEach(bi -> System.out.println(bi));
		System.out.println("-------------------------");

		billItemsSet
		.stream()
		.sorted(new BillItemQuantityComparator())
		.forEach(bi -> System.out.println(bi));
	}
}
