package com.training.ui;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.training.task.FileLetterCountingTask;
import com.training.task.FlightDeparturesPrintingTask;
import com.training.task.OddNumberPrintingTask;
import com.training.workers.EvenNumberCountingThread;

public class Main01 {
	public static void main(String[] args) {
		Runnable runnable1 = new OddNumberPrintingTask(100, 200);
		Runnable runnable2 = new FlightDeparturesPrintingTask();
		Runnable runnable3 = () -> {
			String tname = Thread.currentThread().getName();
			for (int i = 1; i < 10; i++) {
				System.out.println(tname + " : " + "Trivandrum");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable runnable4 = new FileLetterCountingTask("welcome.txt");

		Runnable runnable5 = new EvenNumberCountingThread("ENCT", 100, 120);

		ExecutorService es;
		// es = Executors.newFixedThreadPool(3);
		es = Executors.newSingleThreadExecutor();
		es.submit(runnable1);
		// es.submit(runnable2);
		es.submit(runnable3);
		es.submit(runnable4);
		es.submit(runnable5);

		es.shutdown();

	}
}
