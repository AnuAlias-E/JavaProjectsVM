package com.training.ui;

public class Main01 {
	public static void main(String[] args) {
		System.out.println("Program Begins....");

		System.out.println("Welcome");

		Thread thread = Thread.currentThread();

		thread.setName("Number Printer");
		String threadName = thread.getName();

		for (int i = 0; i <= 10; i++) {
			System.out.println(threadName + " : " + i);

			try {
				thread.sleep(2000);
			} catch (InterruptedException e) {
				System.err.println(e);
				e.printStackTrace();
			}
		}
		System.out.println("Thank You");

		System.out.println("Program Ends....");
	}
}
