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

}

