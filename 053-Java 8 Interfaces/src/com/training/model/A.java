package com.training.model;

public interface A {
	void f1();

	default void f2() {
		System.out.println("f2 in A interface");
	}
	default void f3() {
		System.out.println("f3 in A interface");
	}
	default void f4() {
		System.out.println("f4 in A interface");
	}
	
	static void f5() {
		System.out.println("f5 in A interface");
	}
}
