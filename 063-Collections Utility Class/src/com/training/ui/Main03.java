package com.training.ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;
import com.training.model.comparators.BillItemQuantityComparator;

public class Main03 {
	public static void main(String[] args) {
		List<BillItem> billItems = Arrays.asList(new BillItem("Dell", 5, 50000.00),
				new BillItem("Samsung", 7, 45000.00), new BillItem("Iphone", 2, 80000.00),
				new BillItem("Redmi", 8, 10000.00), new BillItem("Oppo", 9, 14000.00));

		System.out.println(billItems);
		System.out.println("----------------------------------------------------------------------------");
		Collections.sort(billItems);
		System.out.println("After Sorting Item Name");
		System.out.println("----------------------------------------------------------------------------");

		System.out.println(billItems);

		System.out.println("----------------------------------------------------------------------------");

		Collections.sort(billItems, new BillItemPriceComparator());
		System.out.println("After Sorting Price using Comparator");
		System.out.println("----------------------------------------------------------------------------");

		System.out.println(billItems);
		System.out.println("----------------------------------------------------------------------------");

		Collections.sort(billItems, new BillItemQuantityComparator());
		System.out.println("After Sorting quantity using Comparator");
		System.out.println("----------------------------------------------------------------------------");

		System.out.println(billItems);
		System.out.println("----------------------------------------------------------------------------");
		BillItem minBillItem = Collections.min(billItems);
		System.out.println("Minimum Bill Item");
		System.out.println("----------------------------------------------------------------------------");

		System.out.println(minBillItem);
		System.out.println("----------------------------------------------------------------------------");
		BillItem maxBillItem = Collections.max(billItems);
		System.out.println("Maximum Bill Item");
		System.out.println("----------------------------------------------------------------------------");

		System.out.println(maxBillItem);
	}
}
