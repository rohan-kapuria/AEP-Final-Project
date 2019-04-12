package com.company.calculator;
import java.lang.Math;

public class RaiseTo implements TwoNumberOperation {

    @Override
    public double calculateResult(double x, double y) {
        return Math.pow(x, y);
    }
}