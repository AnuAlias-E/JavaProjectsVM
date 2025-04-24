package com.training.ui;

import java.util.PriorityQueue;

public class Main3 {
	public static void main(String[] args) {
		PriorityQueue<String> names;
		names = new PriorityQueue<>();

		names.add("John");
		names.add("Geetha");
		names.add("Nimmi");
		names.add("Baby");
		names.add("Abu");

		System.out.println(names);

		String result = names.poll();
		System.out.println(result);

		result = names.poll();
		System.out.println(result);

		System.out.println(names);
		result = names.poll();
		System.out.println(result);

		System.out.println(names);

	}
}
