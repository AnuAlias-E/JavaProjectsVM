package com.training.ui;

import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) {
		int[] arr = { 24, 36, 120, 480, 520 };
		System.out.println("Array");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int searchData = 24;
		int searchResult = binarySearch(arr, searchData);
		if (searchResult == -1)
			System.out.println("Search Data " + searchData + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search Data " + searchData + " is present at position : " + searchResult);

		 searchData = 62;
		 searchResult = binarySearch(arr, searchData);
		 if (searchResult == -1)
		 System.out.println("Search Data " + searchData + " is not found and the searchResult is " + searchResult);
		 else
		 System.out.println("Search Data " + searchData + " is present at position : "
		 + searchResult);
	}

	private static int binarySearch(int[] arr, int searchElement) {

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
