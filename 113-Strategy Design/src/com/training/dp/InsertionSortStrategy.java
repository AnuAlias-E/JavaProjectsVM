package com.training.dp;

public class InsertionSortStrategy implements SortingStrategy {

	@Override
	public void sort(int[] array) {
		System.out.println("Insertion Sort Strategy Used");

		int n = array.length;
		for (int i = 1; i < n; i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;

		}
	}

}
