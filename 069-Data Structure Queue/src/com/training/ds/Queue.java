package com.training.ds;

public interface Queue<T> {
	void enQueue(T x) throws Exception;

	T getFront();

	void deQueue() throws Exception;

}
