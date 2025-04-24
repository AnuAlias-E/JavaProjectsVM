package com.training.model.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.EvenNumberChecker;

public class EvenNumberCheckerTesting {
	
	@BeforeAll
	public static void init() {
		EvenNumberChecker.number=11;
	}
	
	@AfterAll
	public static void reset() {
		EvenNumberChecker.number=0;
	}
	
	@Test
	@DisplayName("Testing Even Number Computation")
	public void testEvenNumber() {
		boolean expected=false;
		boolean actual=EvenNumberChecker.compute(11);
		assertEquals(expected, actual);
	}

}
