package com.training.ui;

import java.util.Arrays;

public class Main2 {
	
	public static void main(String[] args) {
		double[] arr = { 20.0, 14.0, 12.0, 8.0, 15.33, 6.27, 55.00 };
		double searchData = 14.00;
		System.out.println("Array");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int searchResult = binarySearch(arr, searchData);
		if (searchResult == -1)
			System.out.println("Search Data " + searchData + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search Data " + searchData + " is present at position : " + searchResult);

		searchData = 52.00;
		searchResult = binarySearch(arr, searchData);
		if (searchResult == -1)
			System.out.println("Search Data " + searchData + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search Data " + searchData + " is present at position : " + searchResult);

	}

	private static int binarySearch(double[] arr, double searchElement) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == searchElement)   // check if search element is present at mid
				return mid;     // if search element is present at mid return mid
			if (arr[mid] < searchElement)   // if search element is greater ignore left half array
				low = mid + 1;
			else
				high = mid - 1;// if search element is smaller ignore right half array
		}
		return -1;// not present
	}
}
