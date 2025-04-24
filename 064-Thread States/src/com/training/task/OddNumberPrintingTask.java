package com.training.task;

public class OddNumberPrintingTask implements Runnable {
	private int start;
	private int end;

	public OddNumberPrintingTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		int oddCount = 0;
		for (int i = start; i <= end; i++) {

			if (i % 2 != 0)
				oddCount++;
			System.out.println("\t\t" + name + " : i=" + i + ": Odd Count=" + oddCount);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " Thread: Computed odd numbers count : " + oddCount);

	}

}
