package com.training.workers;

public class NumberPrintingThread extends Thread {

	public void run() {
		Thread thread = Thread.currentThread();
		String threadName = thread.getName();
		for (int i = 50; i <= 70; i++) {
			System.out.println("\t\t" + threadName + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println(e);
				e.printStackTrace();
			}
		}
	}

}
