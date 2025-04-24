package com.training.ui;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.training.task.SummingTask;

public class Main03 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> callable;
		callable = new SummingTask();
		ExecutorService es;
		es = Executors.newSingleThreadExecutor();
		Future<Integer> future = es.submit(callable);
		while (!future.isDone()) {
			System.out.println("Please..wait...computation happening...");
		}
		Integer result = future.get();
		System.out.println(result);
		es.shutdown();
	}
}
