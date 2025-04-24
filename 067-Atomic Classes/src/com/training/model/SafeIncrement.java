package com.training.model;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeIncrement {
	private AtomicInteger counter = new AtomicInteger(0);

	public int getValue() {
		return counter.get();
	}

	public void increment() {
		counter.incrementAndGet();// counter++
	}
}
