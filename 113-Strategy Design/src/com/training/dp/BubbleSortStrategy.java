package com.training.dp;

public class BubbleSortStrategy implements SortingStrategy {

	@Override
	public void sort(int[] array) {
		System.out.println("Bubble Sort Strategy Used");
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {// when the current item is greater than next
					int temp;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

}
