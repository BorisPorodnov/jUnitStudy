package com.porodnov;

public class CalculatorImpl implements Calculator {

    @Override
    public double calculate(String expressions) {
        return Double.parseDouble(expressions);
    }

}
