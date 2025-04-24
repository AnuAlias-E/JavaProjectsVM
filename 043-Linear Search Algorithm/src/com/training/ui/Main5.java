package com.training.ui;

import java.util.Arrays;

import com.training.model.BillItem;

public class Main5 {
	public static int search(BillItem[] billItems, BillItem searchObject) {
		for (int i = 0; i < billItems.length; i++) {
			if (billItems[i].equals(searchObject))
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
		BillItem searchObject = new BillItem("Samsung", 2, 15000.00);
		int searchResult = search(billItems, searchObject);
		if (searchResult == -1)
			System.out
					.println("Search billitem " + searchObject + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search billitem " + searchObject + " is present at position : " + searchResult);
		System.out.println("---------------------------");

		searchObject = new BillItem("Oppo", 2, 15000.00);
		searchResult = search(billItems, searchObject);
		if (searchResult == -1)
			System.out
					.println("Search billitem " + searchObject + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search billitem " + searchObject + " is present at position : " + searchResult);
		System.out.println("---------------------------");

	}
}
