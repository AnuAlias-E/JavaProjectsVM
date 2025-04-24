package com.training.workers;

public class CityNamePrintingThread extends Thread {
	public void run() {

		Thread thread = Thread.currentThread();
		String threadName = thread.getName();
		for (int i = 1; i <= 10; i++) {
			System.out.println("\t" + threadName + " : " + "Cochin");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println(e);
				e.printStackTrace();
			}
		}
	}
}
