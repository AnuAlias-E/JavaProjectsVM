package com.training.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;

public class Main7 {
	public static void main(String[] args) {
		BillItem b1 = new BillItem("Redmi", 3, 14000.00);
		BillItem[] billItems = { new BillItem("Samsung", 2, 15000.00), new BillItem("OPPO", 4, 20000.00),
				new BillItem("IPhone", 4, 24000.00), b1 };
		System.out.println(Arrays.toString(billItems));
		System.out.println("------------------------------");
		System.out.println("BillItem Array Details after sort");
		System.out.println(Arrays.toString(billItems));
		System.out.println("---------------------------");
		Arrays.sort(billItems, new BillItemPriceComparator());
		System.out.println("----------Price Search-----------------");

		BillItem searchObject = new BillItem("Samsung", 2, 15000.00);
		int priceSearchResult = priceSearch(billItems, searchObject);
		if (priceSearchResult == -1)
			System.out.println("Search billitem with price " + searchObject.getPrice()
					+ " is not found and the searchResult is " + priceSearchResult);
		else
			System.out.println("Search billitem with price " + searchObject.getPrice() + " is present at position : "
					+ priceSearchResult);
		System.out.println("---------------------------");

		searchObject = new BillItem("Oppo", 7, 8000.00);
		priceSearchResult = priceSearch(billItems, searchObject);
		if (priceSearchResult == -1)
			System.out.println("Search billitem with price " + searchObject.getPrice()
					+ " is not found and the searchResult is " + priceSearchResult);
		else
			System.out.println("Search billitem with price " + searchObject.getPrice() + " is present at position : "
					+ priceSearchResult);
		System.out.println("---------------------------");

	}

	private static int priceSearch(BillItem[] billItems, BillItem searchObject) {
		Comparator priceComparator = new BillItemPriceComparator();
		int low = 0, high = billItems.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int r = priceComparator.compare(billItems[mid], searchObject);
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
