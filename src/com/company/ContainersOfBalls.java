package com.company;

import java.util.*;

public class ContainersOfBalls {

    public static String organizingContainers(List<List<Integer>> container) {
        /*
            Map the set capacity of each bin
            Count the occurrence of each ball in an Array
            Iterate through bin map using the count of the balls to make sure each bin can hold the balls
            Return Impossible if conditions are not met
         */
        Map<Integer, Integer> bins = new HashMap<>();
        Map<Integer, Integer> ballCounter = new HashMap<>();

        for (int i = 0; i < container.size(); i++) {

            if (bins.get(i) == null) {

                int count = 0;

                for (int j = 0; j < container.get(i).size(); j++) {
                    count+= container.get(i).get(j);

                    if (ballCounter.get(j) == null) {
                        ballCounter.put(j, container.get(i).get(j));
                    } else {
                        int ballCount = ballCounter.get(j);
                        ballCount += container.get(i).get(j);

                        ballCounter.replace(j, ballCount);
                    }
                }

                bins.put(i, count);
            }


        }


        System.out.println(bins);
        System.out.println(ballCounter);


        /*
        compare the count of each type of ball to the capacity of the bins
        if a ball count fits in a bin exactly, move on
        if fails, return Impossible
         */

        for (int i = 0; i < container.get(0).size(); i++) {
            if (bins.get(i) < ballCounter.get(i)) {
                return "Impossible";
            }
        }



        return "Possible";
    }
}
