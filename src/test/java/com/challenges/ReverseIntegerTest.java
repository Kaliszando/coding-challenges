package com.challenges;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ReverseIntegerTest {

    @Test
    @Parameters({"1234, 4321",
                "-234, -432",
                "2147483647, 0"})
    public void shouldReversIntegers(int input, int expected) {
        assertEquals(expected, ReverseIntegerSolution.reverse(input));
    }

    @Test
    @Parameters({"1234, 4321",
                "-234, -432",
                "2147483647, 0"})
    public void shouldReversIntegers2(int input, int expected) {
        assertEquals(expected, ReverseIntegerSolution.reverse2(input));
    }
}
