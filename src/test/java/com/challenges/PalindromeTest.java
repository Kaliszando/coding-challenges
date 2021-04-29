package com.challenges;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class PalindromeTest {

    @Test
    @Parameters({"123454321, true",
            "1234, false",
            "10, false",
            "-4334, false",
            "754457, true"})
    public void shouldVerifyPalindromes(int input, boolean result) {
        assertEquals(result, PalindromeSolution.isPalindrome(input));
    }

    @Test
    @Parameters({"123454321, true",
                 "1234, false",
                 "10, false",
                 "-4334, false",
                 "754457, true"})
    public void shouldVerifyPalindromes2(int input, boolean result) {
        assertEquals(result, PalindromeSolution.isPalindrome2(input));
    }

}
