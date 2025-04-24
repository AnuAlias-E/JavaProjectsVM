package com.training.ui;

import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		double[] arr = { 20.0, 14.0, 12.0, 8.0, 15.33 };
		System.out.println("Before Sort: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++)

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {// when the current item is greater than next
					double temp;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		System.out.println("After Sort: " + Arrays.toString(arr));
	}
}
