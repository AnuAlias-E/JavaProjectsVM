package com.training.dp;

public class SelectionSortStrategy implements SortingStrategy {

	@Override
	public void sort(int[] array) {
		System.out.println("Selection Sort Strategy Used");

		int imin;
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			imin = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[imin]) {
					imin = j;
				}
			}
			int temp;
			temp = array[i];
			array[i] = array[imin];
			array[imin] = temp;

		}
	}

}
