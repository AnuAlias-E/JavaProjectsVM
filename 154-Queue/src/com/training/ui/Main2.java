package com.training.ui;

import java.util.PriorityQueue;

public class Main2 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue;
		queue = new PriorityQueue<>();

		queue.add(30);
		queue.add(22);
		queue.add(18);
		queue.add(40);
		queue.add(36);

		System.out.println(queue);

		int result = queue.poll();
		System.out.println(result);

		result = queue.poll();
		System.out.println(result);

		System.out.println(queue);
		result = queue.poll();
		System.out.println(result);

		System.out.println(queue);

	}
}
