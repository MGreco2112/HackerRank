package com.company;

import java.util.List;

public class JumpingCloudsOG {

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here

        /*
        iterate through list c
        if the cloud ahead of the current cloud by 2 is not a thunderhead
            or the end of list increase the for loop to that cloud
        else increase the loop to the direct next cloud
        increment the steps variable
        if next cloud is null return steps
        */

        int stepsTaken = 0;

        for (int i = 0; i < c.size() - 1; i++) {

            if (i + 2 < c.size() && c.get(i + 2) != 1) {
                i++;
                stepsTaken++;
            } else {
                stepsTaken++;
            }
        }

        return stepsTaken;

    }
}
