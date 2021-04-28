package com.challenges;

public class FizzBuzzSolution {

    public static String FizzBuzz(int number) {
        if(number % 15 == 0) {
            return "FizzBuzz";
        }
        else if(number % 5 == 0) {
            return "Buzz";
        }
        else if(number % 3 == 0) {
            return "Fizz";
        }
        else {
            return String.valueOf(number);
        }
    }

    public static String FizzBuzz2(int number) {
        String result = "";

        if(number % 3 == 0) {
            result += "Fizz";
        }
        if(number % 5 == 0) {
            result += "Buzz";
        }

        if(result.isEmpty()) {
            result += number;
        }

        return result;
    }
}
