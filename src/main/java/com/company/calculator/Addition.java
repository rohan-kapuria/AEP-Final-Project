package com.company.calculator;

public class Addition implements TwoNumberOperation {

    @Override
    public double calculateResult(double x, double y) {
        return x + y;
    }
}