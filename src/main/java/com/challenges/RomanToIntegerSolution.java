package com.challenges;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerSolution {

    private final Map<Character, Integer> symbolNumber;

    public RomanToIntegerSolution() {

        symbolNumber = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

    }

    public int romanToInt(String roman) {

        int result = 0;

        for (int i = 0; i < roman.length() - 1; i++) {
            if(symbolNumber.get(roman.charAt(i)) < symbolNumber.get(roman.charAt(i + 1))) {
                result -= symbolNumber.get(roman.charAt(i));
            }
            else {
                result += symbolNumber.get(roman.charAt(i));
            }
        }

        return result + symbolNumber.get(roman.charAt(roman.length() - 1));
    }
}
