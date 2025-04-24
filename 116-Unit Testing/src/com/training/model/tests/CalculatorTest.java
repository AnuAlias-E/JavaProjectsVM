package com.training.model.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.Calculator;

public class CalculatorTest {
	
	Calculator calculator;
	
	@BeforeEach
	public void init() {
		calculator = new Calculator(10, 5);
	}
	@AfterEach
	public void destroy() {
		calculator=null;
	}
	@Test
	@DisplayName("Testing Addition in Calculator")
	public void testingAdd() {
		
		int expected = 15;
		int actual = calculator.add();
		assertEquals(expected, actual);
		
	}

	@Test
	@DisplayName("Testing Subtraction in Calculator")
	public void testingSubtract() {
		
		int expected = 5;
		int actual = calculator.subtract();
		assertEquals(expected, actual);
		
	}
	
	@Test
	@DisplayName("Testing Multiplication in Calculator")
	public void testingMultiply() {
		
		int expected = 50;
		int actual = calculator.multiply();
		assertEquals(expected, actual);
		
	}

	@Test
	@DisplayName("Testing Division in Calculator")
	public void testingdivide() {
		
		int expected = 2;
		int actual = calculator.divide();
		assertEquals(expected, actual);
		
	}
}
