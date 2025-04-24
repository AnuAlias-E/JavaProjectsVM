package com.training.ui;

import java.util.concurrent.atomic.AtomicInteger;

public class Main01 {
	public static void main(String[] args) {
		AtomicInteger ai;
		ai = new AtomicInteger(20);
		System.out.println(ai.get());
		System.out.println(ai.incrementAndGet());
		ai.set(100);
		System.out.println(ai.getAndAdd(10));
		System.out.println(ai);
		System.out.println(ai.getAndDecrement());
		System.out.println(ai);
		ai.decrementAndGet();
		System.out.println(ai);
	}
}
