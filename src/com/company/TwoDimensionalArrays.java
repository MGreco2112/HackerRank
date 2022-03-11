package com.company;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArrays {
    public static void main(String[] args){

        List<List<Integer>> arr = new ArrayList<>();


        int greatestSum = Integer.MIN_VALUE;

        for (int height = 0; height < arr.size() - 2; height++) {

            for (int length = 0; length < arr.get(0).size() - 2; length++) {
                int currentSum = 0;

                //Refactor currentSum logic to build first hourglass then just reference next indexes to shift values around instead of constantly iterating

                currentSum += arr.get(height).get(length) + arr.get(height).get(length + 1)                     + arr.get(height).get(length + 2) + arr.get(height + 1).get(length + 1)
                        + arr.get(height + 2).get(length) + arr.get(height + 2).get(length + 1)
                        + arr.get(height + 2).get(length + 2);


                if (currentSum > greatestSum) {
                    greatestSum = currentSum;
                }

            }
        }


        System.out.println(greatestSum);


    }
}
