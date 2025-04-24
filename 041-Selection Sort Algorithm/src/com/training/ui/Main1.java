package com.training.ui;

import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) {
		int[] arr = { 19, 12, 6, 14, 13 };
		System.out.println("Before Sort" + Arrays.toString(arr));
		int n = arr.length;

		int imin;
		for (int i = 0; i < n - 1; i++) {
			imin = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[imin]) {
					imin = j;
				}
			}
			int temp;
			temp = arr[i];
			arr[i] = arr[imin];
			arr[imin] = temp;

		}

		System.out.println("After Sort" + Arrays.toString(arr));
		arr = null;
	}
}
