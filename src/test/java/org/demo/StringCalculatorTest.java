package org.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(3, StringCalculator.add("3"));
    }

    @Test
    public void testDoubleNumbers() {
        assertEquals(7, StringCalculator.add("4,3"));
    }

    @Test
    public void testMultipleNumbers() {
        assertEquals(9, StringCalculator.add("4,3,2"));
        assertEquals(120, StringCalculator.add("14,13,22,71,0"));
    }

}
