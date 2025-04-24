package com.training.ui;

import java.util.Arrays;

import com.training.model.Square;

public class Main4 {
	public static void main(String[] args) {

		Square[] squares = { new Square(25), new Square(15), new Square(22), new Square(6) };

		System.out.println("Before Sort \n" + Arrays.toString(squares));
		int n = squares.length;
		for (int i = 1; i < n; i++) {
			Square key = squares[i];
			int j = i - 1;
			int r = squares[j].compareTo(key);
			while (j >= 0 && r > 0) {
				squares[j + 1] = squares[j];
				j = j - 1;
				if (j >= 0)
					r = squares[j].compareTo(key);
			}
			squares[j + 1] = key;

		}
		System.out.println("After Sort" + Arrays.toString(squares));
	}

}
