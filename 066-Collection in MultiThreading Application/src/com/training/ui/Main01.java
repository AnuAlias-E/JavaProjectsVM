package com.training.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main01 {
	public static void main(String[] args) {
		// List<Integer> iList = new ArrayList<>();
		List<Integer> iList = Collections.synchronizedList(new ArrayList<>());
		Runnable runnable1 = () -> {
			for (int i = 0; i < 1000; i++) {
				iList.add(i);
			}
			System.out.println(iList);
		};

		Runnable runnable2 = () -> {
			for (int i = 1000; i < 2000; i++) {
				iList.add(i);
			}
			System.out.println(iList);
		};

		Thread t1 = new Thread(runnable1, "T1");
		Thread t2 = new Thread(runnable2, "T2");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(iList.size());// Main Thread

	}
}
