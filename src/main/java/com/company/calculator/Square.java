package com.company.calculator;

public class Square implements SingleNumberOperation {
    @Override
    public double calculateResult(double x) {
        return x * x;
    }

}
