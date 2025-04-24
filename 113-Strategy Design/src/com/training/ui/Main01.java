package com.training.ui;

import java.util.Arrays;

import com.training.dp.BubbleSortStrategy;
import com.training.dp.InsertionSortStrategy;
import com.training.dp.SelectionSortStrategy;
import com.training.dp.SortingContext;

public class Main01 {
public static void main(String[] args) {
	SortingContext sortingContext=new SortingContext(new BubbleSortStrategy());
	int[] array = { 19, 12, 6, 14, 13,34,17,22 };
	sortingContext.performSort(array);
	System.out.println(Arrays.toString(array));
	
	sortingContext.setSortingStrategy(new SelectionSortStrategy());
	sortingContext.performSort(array);
	System.out.println(Arrays.toString(array));
	
	sortingContext.setSortingStrategy(new InsertionSortStrategy());
	sortingContext.performSort(array);
	System.out.println(Arrays.toString(array));
}
}
