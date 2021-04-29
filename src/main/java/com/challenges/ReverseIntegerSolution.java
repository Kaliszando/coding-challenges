package com.challenges;

public class ReverseIntegerSolution {

    public static int reverse(int number) {

        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(number))).reverse();

        int result;
        try {
            result = Integer.parseInt(sb.toString());
        }
        catch (NumberFormatException e) {
            result = 0;
        }

        return (number < 0) ? -result : result;
    }

    public static int reverse2(int number) {

        String reversed = new StringBuilder(String.valueOf(Math.abs(number))).reverse().toString();
        try {
            return (number < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int reverseUsingInt(int number) {

        int reversed = 0;
        while (Math.abs(number) > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;

            if (reversed < Integer.MIN_VALUE / 10) return 0;
            if (reversed > Integer.MAX_VALUE / 10 ) return 0;
        }

        return reversed;
    }

}

