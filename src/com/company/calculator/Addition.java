package com.company.calculator;

//Understands how to add two numbers

public class Addition implements TwoNumberOperation {

    public double calculateResult(double x, double y) {
        return x + y;
    }
}