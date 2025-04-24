package com.training.ui;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.training.task.FindMinimuminArrayTask;

public class Main06 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Double[] arr = { 55.0, 23.0, 40.0, 50.0, 20.0 };
		Callable<Double> callable;
		callable = new FindMinimuminArrayTask(arr);
		ExecutorService es;
		es = Executors.newSingleThreadExecutor();
		Future<Double> future = es.submit(callable);
		while (!future.isDone()) {
			System.out.println("Please..wait...computation happening...");
		}
		Double result = future.get();
		System.out.println("Minimum Value: " + result);
		es.shutdown();

	}

}
