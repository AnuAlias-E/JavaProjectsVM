package com.training.ui;

import java.util.Arrays;

import com.training.model.Circle;

public class Main3 {
	public static void main(String[] args) {
		Circle[] circles = new Circle[5];

		Circle c1 = new Circle(10);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(15);
		Circle c4 = new Circle(30);
		Circle c5 = new Circle(12);
		circles[0] = c1;
		circles[1] = c2;
		circles[2] = c3;
		circles[3] = c4;
		circles[4] = c5;
		Arrays.sort(circles);
		System.out.println("Circle Details");

		System.out.println(Arrays.toString(circles));
		System.out.println("------------------------------");
		Circle searchObject = new Circle(10);
		int searchResult = binarySearch(circles, searchObject);
		
		if (searchResult == -1)
			System.out.println("Circle with radius " + searchObject.getRadius() + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Circle with radius " + searchObject.getRadius() + " is present at position : " + searchResult);
		
		 searchObject = new Circle(45);
		 searchResult = binarySearch(circles, searchObject);
		
		if (searchResult == -1)
			System.out.println("Circle with radius " + searchObject.getRadius() + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Circle with radius " + searchObject.getRadius() + " is present at position : " + searchResult);

	}

	private static int binarySearch(Circle[] circles, Circle searchObject) {

		int low = 0, high = circles.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int r = circles[mid].compareTo(searchObject);
			if (r==0) 
				return mid; 
			
			if (r < 0) 
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;

	}
}
