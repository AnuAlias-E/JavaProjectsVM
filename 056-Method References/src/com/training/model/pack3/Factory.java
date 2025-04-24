package com.training.model.pack3;

@FunctionalInterface
public interface Factory<T> {
	T create(int data);
}
