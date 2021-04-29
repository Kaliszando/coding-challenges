package com.challenges;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TwoSumTest {

    private TwoSumSolution sut;

    private List<Object[]> getTestArrays() {
        return Arrays.asList(new Object[][] {
                { new int[]{ 1, 2, 3, 4, 5 }, 9 },
                { new int[]{ 9, 8, 1, 2, 3 }, 17 },
                { new int[]{ 4, 7, 5, 3, 8 }, 10 },
                { new int[]{ 2, 5, 6, 9, 7 }, 11 },
                { new int[]{ -6, -2, 7, 4, 9 }, -8 },
                }
        );
    }

    @Before
    public void setUp() {
        sut = new TwoSumSolution();
    }

    @Test
    @Parameters(method = "getTestArrays")
    public void shouldPassTwoSum(int[] numbers, int target) throws Exception {
        var result = sut.twoSum(numbers, target);
        int calculatedTarget = numbers[result[0]] + numbers[result[1]];
        assertEquals(target, calculatedTarget);
    }

    @Test
    @Parameters(method = "getTestArrays")
    public void shouldPassTwoSumHashMap(int[] numbers, int target) throws Exception {
        var result = sut.twoSumHashMap(numbers, target);
        int calculatedTarget = numbers[result[0]] + numbers[result[1]];
        assertEquals(target, calculatedTarget);
    }

    @Test
    @Parameters(method = "getTestArrays")
    public void shouldPassTwoSumHashMap2(int[] numbers, int target) throws Exception {
        var result = sut.twoSumHashMap2(numbers, target);
        int calculatedTarget = numbers[result[0]] + numbers[result[1]];
        assertEquals(target, calculatedTarget);
    }
}
