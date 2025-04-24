package com.training.ui;

public class Main04 {
	public static void main(String[] args) {

		System.out.println("Program Begins....");

		System.out.println("Welcome");
		Thread thread = Thread.currentThread();
		String threadName = thread.getName();
		System.out.println("Thread in main: " + threadName);
		Thread t1, t2;
		Runnable runnable = () -> {
			String name = Thread.currentThread().getName();
			for (int i = 200; i >= 100; i--)
				System.out.println(name + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		};

		t1 = new Thread(runnable, "RNPT");
		t1.start();

		t2 = new Thread(() -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i <= 100; i++) {
				if (i % 5 == 0)
					System.out.println("\t" + name + " : " + "i=" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "MFPT");
		t2.start();

		System.out.println("Thank You");

		System.out.println("Program Ends....");
	}
}
