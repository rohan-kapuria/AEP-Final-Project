package com.company.calculator;

//Understands how to add two numbers

public class Addition implements TwoNumberOperation {

    @Override
    public double calculateResult(double x, double y) {
        return x + y;
    }
}