package com.company.calculator;

//Understands how to calculate nth root of a number

public class nThRoot implements TwoNumberOperation {


    public double calculateResult(double x, double y) {

        if(x < 0)
        {
            System.err.println("Negative!");
            return -1;
        }
        if(x == 0)
            return 0;
        double x1 = x;
        double x2 = x / y;
        while (Math.abs(x1 - x2) > 0.001)
        {
            x1 = x2;
            x2 = ((y - 1.0) * x2 + x / Math.pow(x2, y - 1.0)) / y;
        }
        return x2;
    }

}
