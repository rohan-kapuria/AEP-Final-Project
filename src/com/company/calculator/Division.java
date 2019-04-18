package com.company.calculator;


//Understands how to divide x by y

public class Division implements TwoNumberOperation {


    public double calculateResult(double x, double y) {
        if(y ==0){
            throw new IllegalArgumentException("Divide by 0 Error");
        }else return x / y;
    }

}