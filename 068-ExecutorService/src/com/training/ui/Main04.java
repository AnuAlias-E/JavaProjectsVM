package com.training.ui;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.training.task.ArraySummingTask;

public class Main04 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Double[] arr = { 20.0, 30.0, 40.0, 50.0, 60.0 };
		Callable<Double> callable;
		callable = new ArraySummingTask(arr);
		ExecutorService es;
		es = Executors.newSingleThreadExecutor();
		Future<Double> future = es.submit(callable);
		while (!future.isDone()) {
			System.out.println("Please..wait...computation happening...");
		}
		Double result = future.get();
		System.out.println(result);
		es.shutdown();
	}
}
