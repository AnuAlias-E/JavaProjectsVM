package com.training.ui;

import com.training.task.FlightDeparturesPrintingTask;
import com.training.task.OddNumberPrintingTask;

public class Main03 {
	public static void main(String[] args) {

		System.out.println("Program Begins....");

		System.out.println("Welcome");

		Runnable runnable = new OddNumberPrintingTask(100, 250);
		Thread t1 = new Thread(runnable, "ONPT-1");
		t1.start();

		Thread t2 = new Thread(runnable, "ONPT-2");
		t2.start();

		Thread t3 = new Thread(runnable, "ONPT-3");
		t3.start();

		Thread t4 = new Thread(new FlightDeparturesPrintingTask(), "FDPT-1");
		t4.start();

		Runnable runnable1 = () -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 10; i++)
				System.out.println(name + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		};

		Thread t5 = new Thread(runnable1, "NPT");
		t5.start();

		Thread t6 = new Thread(() -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + 10000);
			System.out.println(name + " : " + 20000);
			System.out.println(name + " : " + 30000);
		}, "SPT");
		t6.start();
		System.out.println("Thank You");

		System.out.println("Program Ends....");
	}
}
