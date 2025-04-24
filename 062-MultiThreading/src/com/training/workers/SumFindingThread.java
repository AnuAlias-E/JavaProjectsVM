package com.training.workers;

public class SumFindingThread extends Thread {

	private int start;
	private int end;

	public SumFindingThread(String name, int start, int end) {
		super(name);
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public void run() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();

		int total = 0;
		for (int i = start; i <= end; i++) {
			total += i;
			System.out.println("\t\t" + name + " : i=" + i + ",total=" + total);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " Thread Computed Sum : " + total);
	}
}
