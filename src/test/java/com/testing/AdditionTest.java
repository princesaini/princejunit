package com.testing;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionTest {

    static Addition adder;

    @BeforeClass
    public static void adderectCreation() {
        adder = new Addition();
    }

    @Test
    public void testAddPositiveNumbers() {
        int x = 10;
        int y = 5;
        int expected = 15;
        int actual = adder.add(x, y);
        assertEquals(expected, actual);
    }

    // Test the add method with some negative numbers
    @Test
    public void testAddNegativeNumbers() {
        int x = -10;
        int y = -5;
        int expected = -15;
        int actual = adder.add(x, y);
        assertEquals(expected, actual);
    }

    // Test the add method with some zero values
    @Test
    public void testAddZeroValues() {
        int x = 0;
        int y = 0;
        int expected = 0;
        int actual = adder.add(x, y);
        assertEquals(expected, actual);
    }

    // Test the add method with some mixed values
    @Test
    public void testAddMixedValues() {
        int x = 10;
        int y = -5;
        int expected = 5;
        int actual = adder.add(x, y);
        assertEquals(expected, actual);
    }   
}
