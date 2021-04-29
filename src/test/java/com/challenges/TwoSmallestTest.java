package com.challenges;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TwoSmallestTest {

    private Object[] getTestArrays() {
        return new Object[]{
                new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 },
                new int[] { 100, 90, 30, -20, -100 },
                new int[] { 3, 0 },
        };
    }

    @Test
    @Parameters(method = "getTestArrays")
    public void shouldReturnTwoMinValues(int[] testArray) throws Exception {
        var result = TwoSmallestSolution.findTwoMin(testArray);

        Arrays.sort(testArray);

        assertEquals(testArray[0], result[0]);
        assertEquals(testArray[1], result[1]);
    }

    @Test
    public void shouldReturnTwoMinValuesBasedOnRandom() throws Exception {
        Random random = new Random();
        int randomArraySize = 100;
        int repetitions = 20;

        for (int i = 0; i < repetitions; i++) {
            int[] numbers = new int[randomArraySize];
            for (int index = 0; index < randomArraySize; index++) {
                numbers[index] = random.nextInt();
            }

            var result = TwoSmallestSolution.findTwoMin(numbers);
            Arrays.sort(numbers);

            assertEquals(numbers[0], result[0]);
            assertEquals(numbers[1], result[1]);
        }
    }

}