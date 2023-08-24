package com.company;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        float posCount = 0;
        float negCount = 0;
        float zeroCount = 0;

        for (Integer num : arr) {
            if (num > 0) {
                posCount++;
            } else if (num < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println(posCount / arr.size());
        System.out.println(negCount / arr.size());
        System.out.println(zeroCount / arr.size());

    }

}
