package com.training.ui;

import com.training.ds.Queue;
import com.training.ds.SimpleQueueImpl;
import com.training.model.Circle;

public class Main04 {
	public static void main(String[] args) {

		Queue<Circle> circleQueue = null;

		try {
			circleQueue = new SimpleQueueImpl<>(10);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			circleQueue.enQueue(new Circle(10));
			circleQueue.enQueue(new Circle(12));
			circleQueue.enQueue(new Circle(9));
			circleQueue.enQueue(new Circle(20));
			circleQueue.enQueue(new Circle(40));
			circleQueue.enQueue(new Circle(23));
			circleQueue.enQueue(new Circle(67));
			circleQueue.enQueue(new Circle(50));
			circleQueue.enQueue(new Circle(49));
			circleQueue.enQueue(new Circle(28));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println(circleQueue);
		Circle c = circleQueue.getFront();
		System.out.println("Front Element: " + c);
		System.out.println("------------------------------------------");
		try {
			circleQueue.deQueue();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println(circleQueue);
		c = circleQueue.getFront();
		System.out.println("Front Element: " + c);
		System.out.println("------------------------------------------");
		try {
			circleQueue.deQueue();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println(circleQueue);
		c = circleQueue.getFront();
		System.out.println("Front Element: " + c);
		System.out.println("------------------------------------------");

		try {
			circleQueue.deQueue();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println(circleQueue);

	}
}