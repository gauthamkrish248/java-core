package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest2 {
	@Test
    public void testMul() {
        Calculator2 calculator = new Calculator2();
        assertEquals(6, calculator.mul(2, 3));
        assertEquals(-6, calculator.mul(2, -3));
        assertEquals(0, calculator.mul(0, 5));
        assertEquals(100, calculator.mul(10, 10));
    }

    @Test
    public void testDiv() {
        Calculator2 calculator = new Calculator2();
        assertEquals(2, calculator.div(6, 3));
        assertEquals(-2, calculator.div(6, -3));
        assertEquals(0, calculator.div(0, 5));
        assertEquals(10, calculator.div(100, 10));
    }

    @Test
    public void testDivByZero() {
        Calculator2 calculator = new Calculator2();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.div(6, 0);
        });
    }
}
