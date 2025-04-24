package com.training.task;

import java.util.concurrent.Callable;

public class FindMinimuminArrayTask implements Callable<Double> {

	Double[] arr;

	public FindMinimuminArrayTask(Double[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public Double call() throws Exception {
		Double min = arr[0];
		for (Double num : arr) {
			if (num < min) {
				min = num;
			}

			Thread.sleep(1000);
			String tname = Thread.currentThread().getName();
			System.out.println(tname + " : " + min);
		}
		return min;
	}

}
