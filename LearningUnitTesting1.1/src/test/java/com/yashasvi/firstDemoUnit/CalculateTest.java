package com.yashasvi.firstDemoUnit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void test() {

        Calculate c = new Calculate();

        int actualValue = c.divide(10, 5);
        int expectedResult = 2;

        assertEquals(expectedResult, actualValue);

        //there is no need to store return value in variable and
        //then pass. we can also do it inline.

        int expectedResult2 = 4;

        assertEquals(expectedResult2, c.divide(20, 5));
    }
}
