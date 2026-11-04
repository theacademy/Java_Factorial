package com.org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {
    @Test
    void calculatesFactorialForOne() {
        assertEquals(1, Main.factorial(1));
    }

    @Test
    void calculatesFactorialForValuesBetweenOneAndTen() {
        assertEquals(120, Main.factorial(5));
    }

    @Test
    void calculatesFactorialForTen() {
        assertEquals(3_628_800, Main.factorial(10));
    }

    @Test
    void rejectsNumbersBelowOne() {
        assertThrows(IllegalArgumentException.class, () -> Main.factorial(0));
    }

    @Test
    void rejectsNumbersAboveTen() {
        assertThrows(IllegalArgumentException.class, () -> Main.factorial(11));
    }
}
