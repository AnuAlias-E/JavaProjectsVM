package com.training.ui;

import com.training.ds.DoubleQueue;

public class Main02 {

	public static void main(String[] args) {
		DoubleQueue queue = null;
		try {
			queue = new DoubleQueue(5);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			queue.enQueue(10.67);
			queue.enQueue(20.34);
			queue.enQueue(30.14);
			queue.enQueue(40.89);
			queue.enQueue(50.42);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println(queue);
		double r = queue.getFront();
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
