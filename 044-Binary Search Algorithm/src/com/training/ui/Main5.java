package com.training.ui;

import java.util.Arrays;

import com.training.model.BillItem;

public class Main5 {
public static void main(String[] args) {


	BillItem b1 = new BillItem("Redmi", 3, 14000.00);
	BillItem[] billItems = { new BillItem("Samsung", 2, 15000.00), new BillItem("OPPO", 4, 20000.00),
			new BillItem("IPhone", 4, 24000.00), b1 };
	System.out.println("BillItem Array Details");
	Arrays.sort(billItems);
	System.out.println(Arrays.toString(billItems));

	System.out.println("------------------------------");
	BillItem searchObject = new BillItem("Samsung", 2, 15000.00);
	int searchResult = binarySearch(billItems, searchObject);
	if (searchResult == -1)
		System.out
				.println("Search billitem with name " + searchObject.getItemName() + " is not found and the searchResult is " + searchResult);
	else
		System.out.println("Search billitem with name " + searchObject.getItemName() + " is present at position : " + searchResult);
	System.out.println("---------------------------");

	searchObject = new BillItem("Oppo", 2, 15000.00);
	searchResult = binarySearch(billItems, searchObject);
	if (searchResult == -1)
		System.out
				.println("Search billitem with name " + searchObject.getItemName() + " is not found and the searchResult is " + searchResult);
	else
		System.out.println("Search billitem with name " + searchObject.getItemName() + " is present at position : " + searchResult);
	System.out.println("---------------------------");


}

private static int binarySearch(BillItem[] billItems, BillItem searchObject) {


	int low = 0, high = billItems.length - 1;
	while (low <= high) {
		int mid = low + (high - low) / 2;
		int r = billItems[mid].compareTo(searchObject);
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
