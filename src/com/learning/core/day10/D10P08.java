package com.learning.core.day10;

public class D10P08 {

}

class Calculator2{
    
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        return a / b;
    }
}
