package com.training.ui;

import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) {
		int[] arr = { 19, 12, 6, 14, 13,34,17,22 };
		System.out.println("Before Sort" + Arrays.toString(arr));
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;

		}
		System.out.println("After Sort" + Arrays.toString(arr));
	}
}
