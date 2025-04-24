package com.training.ui;

import java.util.Arrays;

import com.training.model.Square;

public class Main4 {
	public static void main(String[] args) {
		Square[] squares = { new Square(20), new Square(15), new Square(17), new Square(6) };

		System.out.println("Before Sort \n" + Arrays.toString(squares));

		for (int i = 0; i < squares.length; i++) {

			for (int j = 0; j < squares.length - i - 1; j++) {
				int r = squares[j].compareTo(squares[j + 1]);
				if (r > 0) {// when the current item is greater than next
					Square temp;
					temp = squares[j];
					squares[j] = squares[j + 1];
					squares[j + 1] = temp;
				}
			}
		}
		System.out.println("After Sort \n" + Arrays.toString(squares));
		squares = null;
	}
}
