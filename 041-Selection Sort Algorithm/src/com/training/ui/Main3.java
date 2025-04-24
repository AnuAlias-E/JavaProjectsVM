package com.training.ui;

import java.util.Arrays;

import com.training.model.Circle;

public class Main3 {
	public static void main(String[] args) {
		Circle[] circles = new Circle[4];

		Circle c1 = new Circle(10);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(15);
		Circle c4 = new Circle(30);

		circles[0] = c1;
		circles[1] = c2;
		circles[2] = c3;
		circles[3] = c4;
		System.out.println("Before Sort \n" + Arrays.toString(circles));

		int n = circles.length;

		int imin;
		for (int i = 0; i < n - 1; i++) {
			imin = i;
			for (int j = i + 1; j < n; j++) {
				int r = circles[j].compareTo(circles[imin]);
				if (r < 0) {
					imin = j;
				}
			}
			Circle temp;
			temp = circles[i];
			circles[i] = circles[imin];
			circles[imin] = temp;

		}

		System.out.println("A Sort: " + Arrays.toString(circles));
		circles = null;
	}
}
