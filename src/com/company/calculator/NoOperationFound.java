package com.company.calculator;

import java.util.InputMismatchException;

public class NoOperationFound implements TwoNumberOperation, SingleNumberOperation {

    private String sign;
    NoOperationFound(String sign){
        this.sign = sign;
    }

    @Override
    public double calculateResult(double left, double right) {
        throw new InputMismatchException("Invalid operator sign: " + sign);
    }

    @Override
    public double calculateResult(double left) {
        throw new InputMismatchException("Invalid operator sign: " + sign);
    }
}
