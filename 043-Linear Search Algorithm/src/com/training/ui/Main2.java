package com.training.ui;

public class Main2 {
	public static int search(double[] arr, double searchData) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchData)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		double[] arr = { 20.0, 14.0, 12.0, 8.0, 15.33, 6.27, 55.00 };
		double searchData = 55.00;
		int searchResult = search(arr, searchData);
		if (searchResult == -1)
			System.out.println("Search Data " + searchData + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search Data " + searchData + " is present at position : " + searchResult);

		searchData = 52.00;
		searchResult = search(arr, searchData);
		if (searchResult == -1)
			System.out.println("Search Data " + searchData + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search Data " + searchData + " is present at position : " + searchResult);

	}
}
