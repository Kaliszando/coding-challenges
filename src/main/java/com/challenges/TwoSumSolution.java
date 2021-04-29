package com.challenges;

import java.util.HashMap;

public class TwoSumSolution {

    public int[] twoSum(int[] numbers, int target) throws Exception {

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = 1 + i; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target)
                    return new int[] { i, j };
            }
        }
        throw new Exception("Valid answer does not exist");
    }

    public int[] twoSumHashMap(int[] numbers, int target) throws Exception {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for(int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if(map.containsKey(diff) && map.get(diff) != i) {
                return new int[] { i, map.get(diff) };
            }
        }

        throw new Exception("Valid answer does not exist");
    }

    public int[] twoSumHashMap2(int[] numbers, int target) throws Exception {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if(map.containsKey(diff) && map.get(diff) != i) {
                return new int[] { i, map.get(diff) };
            }
            map.put(numbers[i], i);
        }

        throw new Exception("Valid answer does not exist");
    }
}
