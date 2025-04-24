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
		System.out.println("Before Sort \n" + Arrays.toString(circles));

		int n = circles.length;

		for (int i = 1; i < n; ++i) {
			Circle key = circles[i];
			int j = i - 1;
			int r = circles[j].compareTo(key);
			while (j >= 0 && r > 0) {
				circles[j + 1] = circles[j];
				j = j - 1;
				if (j >= 0) {
					r = circles[j].compareTo(key);
				}
			}
			circles[j + 1] = key;

		}
		System.out.println("After Sort" + Arrays.toString(circles));
	}
}
