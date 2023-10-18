package com.testing;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

import org.junit.Ignore;
import org.junit.Test;


public class DivisionTest {

    @Test
    public void testDivide() {
        Division object = new Division();
        assertThrows("Divide by zero should throw Arithmetic Exception.", ArithmeticException.class, () -> object.divide(2, 0));
    }

    @Test
    @Ignore("This test is ignored.")
    public void disabledTest() {
        fail("This is suppose to fail.");
    }

    @Test 
    public void assumptionTest() {
        boolean databaseServerUp = false;
        assumeTrue(databaseServerUp);
    }
}
