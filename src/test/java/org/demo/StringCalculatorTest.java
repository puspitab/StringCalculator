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

    @Test
    public void testLineBreak() {
        assertEquals(27, StringCalculator.add("14\n13"));
    }

    @Test
    public void testLineBreak2() {
        assertEquals(27, StringCalculator.add("14,13,\n"));
    }

    @Test
    public void testDifferentDelimiter() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
        assertEquals(99, StringCalculator.add("//|\n1|2||33\n31|32"));
        assertEquals(3, StringCalculator.add("//\t\n1\t2"));
    }

    @Test
    public void testNegativeNumbers() {
        try {
            assertEquals(0, StringCalculator.add("-14,-13,\n"));
        } catch (NegativeNumberException e) {
            assertEquals("String contains negative numbers: -14, -13",e.getExMsg());
        }
    }

}
