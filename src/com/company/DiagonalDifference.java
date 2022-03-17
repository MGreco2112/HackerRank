package com.company;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        //L to R: arr.get(0).get(0), arr.get(1).get(2), arr.get(2).get(2)
        //R to L: arr.get(0).get(2), arr.get(1).get(2), arr.get(2).get(0)

        int maxLeftSum = 0;
        int maxRightSum = 0;

        for (int pointer = 0; pointer < arr.size(); pointer++) {
            maxLeftSum += arr.get(pointer).get(pointer);
        }

        int secondPointer = arr.size() - 1;

        for (int pointer = 0; pointer < arr.size(); pointer++) {
            maxRightSum += arr.get(pointer).get(secondPointer);

            secondPointer--;
        }

        System.out.println(maxLeftSum);
        System.out.println(maxRightSum);

        return Math.abs(maxLeftSum - maxRightSum);

    }

}
