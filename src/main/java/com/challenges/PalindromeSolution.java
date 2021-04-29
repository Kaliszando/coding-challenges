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
}
