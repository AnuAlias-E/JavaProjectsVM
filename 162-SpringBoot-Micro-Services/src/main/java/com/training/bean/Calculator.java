package com.training.bean;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int subtract(int a,int b) {
		return a-b;
	}
	
	public int multiply(int a,int b) {
		return a*b;
	}
	
	public int divide(int a,int b) {
		return a/b;
	}
}
