package com.training.model.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.FactorialCalculator;

public class FactorialCalculatorTesting {
		//test the calculate function
	//3 test cases
	//1 test to check for any 1 to 10
	//11 to 15
	//16 to 20
	
	FactorialCalculator factorialCalculator;
	
	@BeforeEach
	public void init() {
		factorialCalculator = new FactorialCalculator();
	}
	@AfterEach
	public void destroy() {
		factorialCalculator=null;
	}
	
	@Test
	@DisplayName("Testing Factorial for an number between 1 to 10")
	public void factTest1() {
		long expected=120;
		factorialCalculator.setNum(5);
		long actual=factorialCalculator.calculate();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Testing Factorial for an number between 11 to 15")
	public void factTest2() {
		long expected=479001600;
		factorialCalculator.setNum(12);
		long actual=factorialCalculator.calculate();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Testing Factorial for an number between 16 to 20")
	public void factTest3() {
		long expected=20922789888000l;
		factorialCalculator.setNum(16);
		long actual=factorialCalculator.calculate();
		assertEquals(expected, actual);
	}
}
