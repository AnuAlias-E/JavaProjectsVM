package com.training.task;

import java.util.concurrent.Callable;

public class SummingTask implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			Thread.sleep(1000);
			String tname = Thread.currentThread().getName();
			System.out.println(tname + " : " + sum);
		}
		return sum;
	}

}
