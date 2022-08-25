package com.company;

public class BitwiseAnd {
    public static int bitwiseAnd(int N, int K) {
        //iterate from 1 to < N
        // iterate from current outer index + 1 to N
        // Get binary difference using & of outer loop and inner loop pointers
        // if outer pointer < inner pointer && binDiff > currentMax
        //currentMax = binDiff
        //after loop return currentMax

        int currentMax = 0;

        for (int outerPointer = 1; outerPointer < N; outerPointer++) {
            for (int innerPointer = outerPointer + 1; innerPointer <= N; innerPointer++) {
                int binDiff = outerPointer & innerPointer;

                if (binDiff < K && binDiff > currentMax) {
                    currentMax = binDiff;
                }
            }
        }

        return currentMax;

    }
}
