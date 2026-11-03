package com.org.assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFactorial {

	@Test
	void acceptsNumbersWithinTheSupportedRange() {
		assertTrue(Factorial.isValidNumber(1));
		assertTrue(Factorial.isValidNumber(5));
		assertTrue(Factorial.isValidNumber(10));
	}

	@Test
	void rejectsNumbersOutsideTheSupportedRange() {
		assertFalse(Factorial.isValidNumber(0));
		assertFalse(Factorial.isValidNumber(11));
	}

	@Test
	void calculatesFactorials() {
		assertEquals(1, Factorial.factorial(1));
		assertEquals(120, Factorial.factorial(5));
		assertEquals(3_628_800, Factorial.factorial(10));
	}

	@Test
	void refusesToCalculateFactorialForInvalidNumbers() {
		assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(0));
		assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(11));
	}
}
