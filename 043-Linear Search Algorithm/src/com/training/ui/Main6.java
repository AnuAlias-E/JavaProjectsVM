package com.training.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;
import com.training.model.comparators.BillItemQuantityComparator;

public class Main6 {
	public static int search(BillItem[] billItems, BillItem searchObject) {
		for (int i = 0; i < billItems.length; i++) {
			if (searchObject instanceof Comparable) {
				Comparable searchData = (Comparable) searchObject;
				int r = billItems[i].compareTo(searchObject);
				if (r == 0)
					return i;
			}
		}
		return -1;
	}

	public static int quantitySearch(BillItem[] billItems, BillItem searchObject) {
		Comparator quantityComparator = new BillItemQuantityComparator();
		for (int i = 0; i < billItems.length; i++) {

			int r = quantityComparator.compare(billItems[i], searchObject);
			if (r == 0)
				return i;

		}
		return -1;
	}

	public static int priceSearch(BillItem[] billItems, BillItem searchObject) {
		Comparator priceComparator = new BillItemPriceComparator();
		for (int i = 0; i < billItems.length; i++) {

			int r = priceComparator.compare(billItems[i], searchObject);
			if (r == 0)
				return i;

		}
		return -1;
	}

	public static void main(String[] args) {

		BillItem b1 = new BillItem("Redmi", 3, 14000.00);
		BillItem[] billItems = { new BillItem("Samsung", 2, 15000.00), new BillItem("OPPO", 4, 20000.00),
				new BillItem("IPhone", 4, 24000.00), b1 };
		System.out.println("BillItem Array Details");
		System.out.println(Arrays.toString(billItems));
		System.out.println("------------------------------");
		System.out.println("--------------Name Search----------------");
		BillItem searchObject = new BillItem("Samsung", 2, 15000.00);
		int searchResult = search(billItems, searchObject);
		if (searchResult == -1)
			System.out.println("Search billitem with name " + searchObject + " is not found and the searchResult is "
					+ searchResult);
		else
			System.out
					.println("Search billitem with name " + searchObject + " is present at position : " + searchResult);
		System.out.println("---------------------------");

		
		searchObject = new BillItem("Oppo", 2, 15000.00);
		searchResult = search(billItems, searchObject);
		if (searchResult == -1)
			System.out.println("Search billitem with name " + searchObject + " is not found and the searchResult is "
					+ searchResult);
		else
			System.out
					.println("Search billitem with name " + searchObject + " is present at position : " + searchResult);
		System.out.println("---------------------------");
		
		

		System.out.println("-------------Quantity Search--------------");
		searchObject = new BillItem("Samsung", 2, 15000.00);
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
		
		
		System.out.println("---------------------------");

		System.out.println("----------Price Search-----------------");

		searchObject = new BillItem("Samsung", 2, 15000.00);
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
}
