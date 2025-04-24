package com.training.workers;

public class EvenNumberCountingThread extends Thread {
	private int start;
	private int end;

	public EvenNumberCountingThread(String name, int start, int end) {
		super(name);
		this.start = start;
		this.end = end;
	}

	public void run() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();

		int evenCount = 0;
		for (int i = start; i <= end; i++) {

			if (i % 2 == 0)
				evenCount++;

			System.out.println("\t\t" + name + " : i=" + i + " : Even Count=" + evenCount);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " Thread: Computed Even numbers count : " + evenCount);
	}
}
