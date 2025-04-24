package com.training.ds;

public interface Queue<T> {
	void enQueue(T object)throws Throwable;
	T deQueue()throws Throwable;

}
