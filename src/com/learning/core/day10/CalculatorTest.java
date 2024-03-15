package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(100, calculator.add(50, 50));
    }
    
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.sub(3, 2));
        assertEquals(-3, calculator.sub(0, 3));
        assertEquals(5, calculator.sub(10, 5));
        assertEquals(0, calculator.sub(100, 100));
    }
}
