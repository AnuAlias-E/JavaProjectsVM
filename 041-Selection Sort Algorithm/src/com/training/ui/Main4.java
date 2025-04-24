package com.training.ui;

import java.util.Arrays;

import com.training.model.Square;

public class Main4 {
	public static void main(String[] args) {
		Square[] squares = { new Square(20), new Square(15), new Square(17), new Square(6) };

		System.out.println("Before Sort \n" + Arrays.toString(squares));
		int n = squares.length;

		int imin;
		for (int i = 0; i < n - 1; i++) {
			imin = i;
			for (int j = i + 1; j < n; j++) {
				int r = squares[j].compareTo(squares[imin]);
				if (r < 0) {
					imin = j;
				}
			}
			Square temp;
			temp = squares[i];
			squares[i] = squares[imin];
			squares[imin] = temp;

		}

		System.out.println("After Sort: " + Arrays.toString(squares));
		squares = null;
	}
}
