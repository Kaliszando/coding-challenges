package com.challenges;

class PalindromeSolution {

    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);

        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome2(int number) {
        if (number < 0) return false;

        int halfReversed = 0;
        while (number > halfReversed) {
            halfReversed = halfReversed * 10 + number % 10;
            number /= 10;
        }

        return number == halfReversed / 10 || number == halfReversed;
    }
}
