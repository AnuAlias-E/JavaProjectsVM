package com.training.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main02 {
	public static void main(String[] args) {
		List<Double> dList = Collections.synchronizedList(new ArrayList<>());

		Runnable runnable1 = () -> {
			for (double i = 1; i <= 100; i++) {
				dList.add(i);
			}

		};

		Runnable runnable2 = () -> {
			for (double i = 101; i <= 300; i++) {
				dList.add(i);
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
		// System.out.println(dList);
		System.out.println(dList.size());
	}
}
