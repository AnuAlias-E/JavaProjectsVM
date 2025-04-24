package com.training.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.Calculator;

public class CalculatorTesting {
	Calculator calculator;

	@BeforeEach
	public void setup() {
		calculator = new Calculator();
	}

	@AfterEach
	public void tearDown() {
		calculator = null;
	}

	@Test
	@DisplayName("Add Testing")
	public void addTesting() {
		int expected = 15;
		int actual = this.calculator.add(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Subtract Testing")
	public void subtractTesting() {
		int expected = 5;
		int actual = this.calculator.subtract(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Multiply Testing")
	public void multiplyTesting() {
		int expected = 50;
		int actual = this.calculator.multiply(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Division Testing")
	public void divideTesting() {
		int expected = 2;
		int actual = this.calculator.divide(10, 5);
		assertEquals(expected, actual);
	}
}
