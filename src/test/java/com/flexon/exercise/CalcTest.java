package com.flexon.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class CalcTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }



    @Test
    public void addTest(){

        assertEquals(Calc.add(1,2),3);

    }
    @Test
    public void divTest(){
        assertEquals(Calc.divide(4,2),2);
    }
    @Test
    public void mulTest(){
        assertEquals(Calc.multiply(4,2),8);
    }
    @Test
    public void subTest(){
        assertEquals(Calc.subtract(4,1),3);
    }
    @Test(expected = java.lang.ArithmeticException.class)
    public void modTest(){
        Calc.mod(4,0);
    }
}
