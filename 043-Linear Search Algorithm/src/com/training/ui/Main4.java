package com.training.ui;

import java.util.Arrays;

import com.training.model.Square;

public class Main4 {


	public static int search(Square[] squares, Square searchObject) {
		for (int i = 0; i < squares.length; i++) {
			if (squares[i].equals(searchObject))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Square[] squares = { new Square(25), new Square(15), new Square(22), new Square(6) };
		System.out.println("Square Array Details");
		System.out.println( Arrays.toString(squares));
	
		System.out.println("------------------------------");
		Square searchObject = new Square(22);
		int searchResult = search(squares, searchObject);
		if (searchResult == -1)
			System.out
					.println("Search radius " + searchObject + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search radius " + searchObject + " is present at position : " + searchResult);
		System.out.println("---------------------------");
		
		 searchObject = new Square(43);
		 searchResult = search(squares, searchObject);
		if (searchResult == -1)
			System.out
					.println("Search radius " + searchObject + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search radius " + searchObject + " is present at position : " + searchResult);
		System.out.println("---------------------------");
	
	
	}

}
