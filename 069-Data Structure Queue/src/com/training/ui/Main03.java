package com.training.ui;

import com.training.ds.Queue;
import com.training.ds.SimpleQueueImpl;

public class Main03 {
	public static void main(String[] args) {
		Queue<String> queue = null;
		try {
			queue = new SimpleQueueImpl<>(5);
		} catch (Exception e) {
			System.err.println(e.getMessage());

		}
		try {
			queue.enQueue("Jancy");
			queue.enQueue("Kiran");
			queue.enQueue("Ram");
			queue.enQueue("Reshmi");
			queue.enQueue("Menaka");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println(queue.toString());
		String r = queue.getFront();
		System.out.println(r);

		try {
			queue.deQueue();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println(queue);
		r = queue.getFront();
		System.out.println(r);

		try {
			queue.deQueue();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println(queue);
		r = queue.getFront();
		System.out.println(r);

		try {
			queue.deQueue();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
