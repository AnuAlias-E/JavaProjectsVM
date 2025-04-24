package com.training.task;

import java.util.concurrent.Callable;

public class ArraySummingTask implements Callable<Double> {
	Double[] arr;

	public ArraySummingTask(Double[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public Double call() throws Exception {
		Double sum = 0.0;
		for (Double num : arr) {
			sum += num;
			Thread.sleep(1000);
			String tname = Thread.currentThread().getName();
			System.out.println(tname + " : " + sum);
		}
		return sum;
	}

}
