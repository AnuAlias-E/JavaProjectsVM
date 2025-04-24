package com.training.ui;

import java.util.ArrayList;
import java.util.List;

public class Main03 {
	public static void main(String[] args) {
		List<Integer> iList = new ArrayList<>();
		Runnable runnable1 = () -> {
			synchronized (iList) {
				for (int i = 1; i <= 10; i++) {

					iList.add(i);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Runnable runnable2 = () -> {
			synchronized (iList) {
				for (int i = 11; i <= 20; i++) {

					iList.add(i);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t1 = new Thread(runnable1, "T1");
		Thread t2 = new Thread(runnable2, "T2");

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(iList.size());
		System.out.println(iList);
	}
}
