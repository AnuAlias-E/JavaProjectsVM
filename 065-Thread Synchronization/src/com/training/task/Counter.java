package com.training.task;

public class Counter {

	int count = 0;


	public synchronized int getCount() {
		return count;
	}

	public synchronized void increment() {

		String tname = Thread.currentThread().getName();
		for (int i = 1; i <= 10; i++) {
			count++;
			System.out.println(tname + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
