package com.company.calculator;

import java.util.HashMap;
import java.util.Map;

//Understands the operations allowed


public class Calculator {
    private Map<String, TwoNumberOperation> operationMap = new HashMap<String, TwoNumberOperation>();
    private Map<String, SingleNumberOperation> operationMap2 = new HashMap<String, SingleNumberOperation>();

    Calculator() {
        operationMap.put("add", new Addition());
        operationMap.put("subtract", new Subtraction());
        operationMap.put("multiply", new Multiplication()); //multiply
        operationMap.put("divide", new Division()); //divide
        operationMap.put("raiseTo", new RaiseTo()); //x raise to y
        operationMap.put("nthroot", new nThRoot()); //yth root of x
        operationMap2.put("square", new Square()); //square
        operationMap2.put("cube", new Cube()); //cube
    }

    double makeCalculation(double operand1, double operand2, String operation) {
        TwoNumberOperation twoNumberOperationMapValue = operationMap.getOrDefault(operation,new NoOperationFound(operation));
        return twoNumberOperationMapValue.calculateResult(operand1, operand2);
    }

    double makeCalculation(double operand1, String operation) {
        SingleNumberOperation singleNumberOperationMapValue = operationMap2.getOrDefault(operation,new NoOperationFound(operation));
        return singleNumberOperationMapValue.calculateResult(operand1);
    }

}