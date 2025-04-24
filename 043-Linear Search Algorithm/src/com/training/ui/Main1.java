package com.training.ui;

public class Main1 {
	public static int search(int[] arr, int searchData) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchData)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 24, 36, 12, 48, 52 };
		int searchData=70;
		int searchResult = search(arr, searchData);
		if (searchResult == -1)
			System.out.println("Search Data "+searchData+" is not found and the searchResult is "+searchResult);
		else
			System.out.println("Search Data "+searchData+" is present at position : " + searchResult);

		 searchData=52;
		 searchResult = search(arr, searchData);
		if (searchResult == -1)
			System.out.println("Search Data "+searchData+" is not found and the searchResult is "+searchResult);
		else
			System.out.println("Search Data "+searchData+" is present at position : " + searchResult);
	
	}
}

