package com.company.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    //Test 1
    @Test
    public void addsTwoNumbers() {
        assertEquals(8.0, calculator.makeCalculation(6.0,2.0,"add"));
    }

    //Test 2
    @Test
    public void subtractsTwoNumbers() {
        assertEquals(4.0, calculator.makeCalculation(6.0, 2.0, "subtract"));
    }

    //Test 3
    @Test
    public void multipliesTwoNumbers() {
        assertEquals(12.0, calculator.makeCalculation(6.0, 2.0, "multiply"));
    }


}