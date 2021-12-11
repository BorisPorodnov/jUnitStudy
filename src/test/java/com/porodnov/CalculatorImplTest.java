package com.porodnov;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorImplTest {

    private CalculatorImpl calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new CalculatorImpl();
    }

    @Test
    public void zeroTest() {
        double result = new CalculatorImpl().calculate("0");
        assertEquals(0, result, 1e-9);
    }

    @Test
    public void floatingPointTest() {
        double result = new CalculatorImpl().calculate("-3e3");
        assertEquals(-3000, result, 1e-9);
    }

    @Test
    public void additionTest() {
        double result = new CalculatorImpl().calculate("2+2");
        assertEquals(4, result, 1e-9);
    }

}