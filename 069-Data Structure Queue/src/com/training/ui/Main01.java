package com.training.ui;

import com.training.ds.IntQueue;

public class Main01 {
	public static void main(String[] args) {
		IntQueue queue = null;
		try {
			queue = new IntQueue(5);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			queue.enQueue(10);
			queue.enQueue(20);
			queue.enQueue(30);
			queue.enQueue(40);
			queue.enQueue(50);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println(queue);
		int r = queue.getFront();
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
		r = queue.getFront();
		System.out.println(r);

		System.out.println(queue.toString());
	}
}
