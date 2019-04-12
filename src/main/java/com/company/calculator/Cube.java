package com.company.calculator;

public class Cube implements SingleNumberOperation {
    @Override
    public double calculateResult(double x) {
        return x*x*x;
    }
}
