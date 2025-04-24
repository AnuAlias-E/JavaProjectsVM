package com.training.ui;

import java.util.Arrays;

import com.training.model.Square;

public class Main4 {
	public static void main(String[] args) {

		Square[] squares = { new Square(25), new Square(15), new Square(22), new Square(6) };
		System.out.println("Square Array Details");
		Arrays.sort(squares);
		System.out.println(Arrays.toString(squares));

		System.out.println("------------------------------");
		Square searchObject = new Square(22);
		int searchResult = binarysearch(squares, searchObject);
		if (searchResult == -1)
			System.out
					.println("Square with size " + searchObject.getSize() + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Square with size " + searchObject.getSize() + " is present at position : " + searchResult);
		System.out.println("---------------------------");

		searchObject = new Square(43);
		searchResult = binarysearch(squares, searchObject);
		if (searchResult == -1)
			System.out
					.println("Square with size " + searchObject.getSize() + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Square with size " + searchObject.getSize() + " is present at position : " + searchResult);
		System.out.println("---------------------------");

	}

	private static int binarysearch(Square[] squares, Square searchObject) {

		int low = 0, high = squares.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int r = squares[mid].compareTo(searchObject);
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
