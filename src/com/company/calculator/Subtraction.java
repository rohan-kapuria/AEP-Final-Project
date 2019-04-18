package com.company.calculator;

public class Subtraction implements TwoNumberOperation {

    @Override
    public double calculateResult(double left, double right) {
        return left - right;
    }

}
