package com.training.model;

import java.util.concurrent.atomic.AtomicLong;

public class SafeLongIncrement {
	private AtomicLong atomicLong = new AtomicLong(0);

	public long getValue() {
		return atomicLong.get();
	}

	public void increment() {
		atomicLong.incrementAndGet();
	}
}
