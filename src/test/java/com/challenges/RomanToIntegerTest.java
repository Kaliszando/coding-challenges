package com.challenges;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class RomanToIntegerTest {

    RomanToIntegerSolution sut;

    @Before
    public void setUp() {
        sut = new RomanToIntegerSolution();
    }

    @Test
    @Parameters({"MCMXCIV, 1994",
                 "M, 1000"})
    public void shouldConvertRomanToInteger(String roman, int expected) {
        assertEquals(expected, sut.romanToInt(roman));
    }
}
