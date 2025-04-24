package com.training.ui;

public class Main01 {
	public static void main(String[] args) {
		
		Runnable runnable  = new Runnable() {
			
			@Override
			public  synchronized void run() {
				String tname = Thread.currentThread().getName();
				System.out.print(tname);
				System.out.print("[");
				for (int i = 1; i <= 5; i++) {
					System.out.print(i + ",");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print("]");
				
			}
		};
	

		Thread t1 = new Thread(runnable, "T1");
		t1.start();
		
		
		Thread t2= new Thread(runnable,"T2");
		t2.start();
		
	}
}
