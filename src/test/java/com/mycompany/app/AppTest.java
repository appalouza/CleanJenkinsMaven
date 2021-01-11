package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void addTest() {
        CalculatorJenkins myCalc = new CalculatorJenkins();
        assertEquals(10, myCalc.addNumbers(5, 5));
    }

    @Test
    public void subTest() {
        CalculatorJenkins myCalc = new CalculatorJenkins();
        assertEquals(5, myCalc.subNumbers(10, 5));
    }
}
