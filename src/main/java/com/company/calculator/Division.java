package com.company.calculator;

public class Division implements TwoNumberOperation {

    @Override
    public double calculateResult(double x, double y) {
        if(y ==0){
            throw new IllegalArgumentException("Divide by 0 Error");
        }else return x / y;
    }

}