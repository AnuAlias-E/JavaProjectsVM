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

		for (int i = 0; i < circles.length; i++) {

			for (int j = 0; j < circles.length - i - 1; j++) {
				int r = circles[j].compareTo(circles[j+1]);
				if (r>0) {// when the current item is greater than next
					Circle temp;
					temp = circles[j];
					circles[j] = circles[j + 1];
					circles[j + 1] = temp;
				}
			}
		}
		System.out.println("After Sort \n" + Arrays.toString(circles));

	}
}
