package com.company.calculator;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

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

    //Test 4
    @Test
    public void dividesTwoNumbers() {
        assertEquals(3.0, calculator.makeCalculation(6.0, 2.0, "divide"));
    }

    //Test 5
    @Test
    public void divideByZero() {
        try{
            assertEquals(3.0, calculator.makeCalculation(6.0, 0, "divide"));
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

    //Test 6
    @Test
    public void illegalOperator() {
        try {
            assertEquals(8.0, calculator.makeCalculation(6.0, 2.0, "Abcd"));
        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }

    //Test 7
    @Test
    public void aRaiseToB() {
        assertEquals(4.0, calculator.makeCalculation(2.0, 2, "raiseTo"));
    }

    //Test 8
    @Test
    public void squareNumber() {
        assertEquals(4.0, calculator.makeCalculation(2.0, "square"));
    }

    //Test 9
    @Test
    public void cubeNumber() {
        assertEquals(8.0, calculator.makeCalculation(2.0, "cube"));
    }
    
    //Test 10
    @Test
    public void nThRoot() {
        assertEquals(2.0, calculator.makeCalculation(4.0,2.0, "nthroot"));
    }

}