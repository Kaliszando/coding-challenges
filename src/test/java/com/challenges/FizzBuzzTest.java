package com.challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private int scope = 1_000_000;

    @Test
    public void shouldAnswerWithFizz() {
        for(int i = 3; i < scope; i*=3) {
            assertEquals("Fizz", FizzBuzzSolution.FizzBuzz(i));
        }
    }

    @Test
    public void shouldAnswerWithFizz2() {
        for(int i = 3; i < scope; i*=3) {
            assertEquals("Fizz", FizzBuzzSolution.FizzBuzz2(i));
        }
    }

    @Test
    public void shouldAnswerWithBuzz() {
        for(int i = 5; i < scope; i*=5) {
            assertEquals("Buzz", FizzBuzzSolution.FizzBuzz(i));
        }
    }

    @Test
    public void shouldAnswerWithBuzz2() {
        for(int i = 5; i < scope; i*=5) {
            assertEquals("Buzz", FizzBuzzSolution.FizzBuzz2(i));
        }
    }

    @Test
    public void shouldAnswerWithFizzBuzz() {
        for(int i = 15; i < scope; i+=15) {
            assertEquals("FizzBuzz", FizzBuzzSolution.FizzBuzz(i));
        }
    }

    @Test
    public void shouldAnswerWithFizzBuzz2() {
        for(int i = 15; i < scope; i+=15) {
            assertEquals("FizzBuzz", FizzBuzzSolution.FizzBuzz2(i));
        }
    }

    @Test
    public void shouldAnswerWithNumber() {
        for(int i = 0; i < scope; i++) {
            if(i % 5 != 0 && i % 3 != 0) {
                assertEquals(String.valueOf(i), FizzBuzzSolution.FizzBuzz(i));
            }
        }
    }

    @Test
    public void shouldAnswerWithNumber2() {
        for(int i = 0; i < scope; i++) {
            if(i % 5 != 0 && i % 3 != 0) {
                assertEquals(String.valueOf(i), FizzBuzzSolution.FizzBuzz(i));
            }
        }
    }

}
