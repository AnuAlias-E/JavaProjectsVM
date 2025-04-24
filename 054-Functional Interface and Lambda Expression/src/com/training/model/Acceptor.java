package com.training.model;

@FunctionalInterface
public interface Acceptor<T> {
	void accept(T obj);
}
