package com.training.model;

public interface X {
	default void fun7() {
		System.out.println("fun7 in X interface ");
	}

	static void fun8() {
		System.out.println("fun8 in X interface ");
	}

	void fun9();
}
