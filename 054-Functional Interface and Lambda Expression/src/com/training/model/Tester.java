package com.training.model;

@FunctionalInterface
public interface Tester<T> {
	boolean test(T obj);
}
