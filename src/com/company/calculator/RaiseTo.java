package com.company.calculator;
import java.lang.Math;

//Understands how to calculate x raise to y

public class RaiseTo implements TwoNumberOperation {


    public double calculateResult(double x, double y) {
        return Math.pow(x, y);
    }
}