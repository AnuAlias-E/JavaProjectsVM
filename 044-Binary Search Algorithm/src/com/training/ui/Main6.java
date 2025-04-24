package com.training.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemQuantityComparator;

public class Main6 {
	public static void main(String[] args) {
		BillItem b1 = new BillItem("Redmi", 3, 14000.00);
		BillItem[] billItems = { new BillItem("Samsung", 2, 15000.00), new BillItem("OPPO", 4, 20000.00),
				new BillItem("IPhone", 4, 24000.00), b1 };
		System.out.println(Arrays.toString(billItems));
		System.out.println("------------------------------");
		System.out.println("BillItem Array Details after sort");
		Arrays.sort(billItems,new BillItemQuantityComparator());
		System.out.println(Arrays.toString(billItems));
		System.out.println("------------------------------");

		System.out.println("-------------Quantity Search--------------");
		BillItem searchObject = new BillItem("Samsung", 4, 15000.00);
		int qtySearchResult = quantitySearch(billItems, searchObject);
		if (qtySearchResult == -1)
			System.out.println("Search billitem with quantity " + searchObject.getQuantity()
					+ " is not found and the searchResult is " + qtySearchResult);
		else
			System.out.println("Search billitem with quantity " + searchObject.getQuantity()
					+ " is present at position : " + qtySearchResult);

		searchObject = new BillItem("Oppo", 7, 15000.00);
		System.out.println("---------------------------");
		qtySearchResult = quantitySearch(billItems, searchObject);
		if (qtySearchResult == -1)
			System.out.println("Search billitem with quantity " + searchObject.getQuantity()
					+ " is not found and the searchResult is " + qtySearchResult);
		else
			System.out.println("Search billitem with quantity " + searchObject.getQuantity()
					+ " is present at position : " + qtySearchResult);

	}

	

	private static int quantitySearch(BillItem[] billItems, BillItem searchObject) {

		Comparator quantityComparator = new BillItemQuantityComparator();
		int low = 0, high = billItems.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int r = quantityComparator.compare(billItems[mid], searchObject);
			if (r == 0)
				return mid;

			if (r < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	}
