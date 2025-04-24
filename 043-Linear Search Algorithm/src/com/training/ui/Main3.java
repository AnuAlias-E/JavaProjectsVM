package com.training.ui;

import java.util.Arrays;

import com.training.model.Circle;

public class Main3 {

	public static int search(Circle[] circles, Circle searchObject) {
		for (int i = 0; i < circles.length; i++) {
			if (circles[i].equals(searchObject))
				return i;
		}
		return -1;
	}

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
		System.out.println("Circle Details");
		System.out.println(Arrays.toString(circles));
		System.out.println("------------------------------");
		Circle searchObject = new Circle(30);
		int searchResult = search(circles, searchObject);
		if (searchResult == -1)
			System.out
					.println("Search radius " + searchObject + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search radius " + searchObject + " is present at position : " + searchResult);
		System.out.println("---------------------------");
		searchObject = new Circle(38);
		 searchResult = search(circles, searchObject);
		if (searchResult == -1)
			System.out
					.println("Search radius " + searchObject + " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search radius " + searchObject + " is present at position : " + searchResult);
		System.out.println("---------------------------");
	
	
	}
}
