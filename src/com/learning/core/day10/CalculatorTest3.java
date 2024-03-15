package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest3 {
	@Test
    public void testFindMax() {
        Calculator3 calculator = new Calculator3();
        
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        assertEquals(6, calculator.findMax(arr1));
        
        int[] arr2 = {-1, -2, -3, -4, -5, -6};
        assertEquals(-1, calculator.findMax(arr2));
    }
}
