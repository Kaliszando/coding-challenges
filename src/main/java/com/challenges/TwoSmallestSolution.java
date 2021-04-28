package com.challenges;

public class TwoSmallestSolution {

    public static int[] findTwoMin(int[] collection) throws Exception {
        if(collection.length < 2) {
            throw new Exception("Collection has not enough elements");
        }

        int[] smallestFound = new int[2];
        smallestFound[0] = Integer.MAX_VALUE;
        smallestFound[1] = Integer.MAX_VALUE;

        for(var number : collection) {
            if(number < smallestFound[0]) {
                smallestFound[1] = smallestFound[0];
                smallestFound[0] = number;
            }
            else if(number < smallestFound[1]) {
                smallestFound[1] = number;
            }
        }

        return smallestFound;
    }
}
