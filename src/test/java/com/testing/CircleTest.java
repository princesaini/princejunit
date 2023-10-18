package com.testing;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CircleTest {
    static Circle circle;

    @BeforeClass
    public static void createInstanceOfCircle() {
        circle = new Circle();
    }

    @Test
    public void areaOfCircle1() {
        double expected = 78.54;
        double actual = circle.areaOfCircle(5);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void areaOfCircle2() {
        double expected = 12.56; 
        double actual = circle.areaOfCircle(2);

        assertEquals(expected, actual, 0.01);
    }
}
