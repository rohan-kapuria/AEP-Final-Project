package com.company.calculator;

import java.util.InputMismatchException;

//Understands invalid operations

public class NoOperationFound implements TwoNumberOperation, SingleNumberOperation {

    private String sign;
    NoOperationFound(String sign){
        this.sign = sign;
    }


    public double calculateResult(double left, double right) {
        throw new InputMismatchException("Invalid operator sign: " + sign);
    }


    public double calculateResult(double left) {
        throw new InputMismatchException("Invalid operator sign: " + sign);
    }
}
