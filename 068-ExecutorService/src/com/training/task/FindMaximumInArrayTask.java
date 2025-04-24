package com.training.task;

import java.util.concurrent.Callable;

public class FindMaximumInArrayTask implements Callable<Double> {

	Double[] arr;

	public FindMaximumInArrayTask(Double[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public Double call() throws Exception {
		Double max = arr[0];
		for (Double num : arr) {
			if (num > max) {
				max = num;
			}

			Thread.sleep(1000);
			String tname = Thread.currentThread().getName();
			System.out.println(tname + " : " + max);
		}
		return max;
	}

}
