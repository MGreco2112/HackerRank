package com.company;

import java.util.Objects;

public class JumpingCloudsRedux {

    /*
        Initialize int variable energy to 100
        Iterate through int [] c at a rate of k per iteration
        Each iteration is at a rate of c[(i+k) %n]
        Each iteration costs 1 energy
        If c[i] is 1 then decrease energy by another 2

     */

    static int jumpingOnClouds(int[] c, int k) {
        boolean firstIteration = true;

        int energy = 100;

        for (int i = 0; i < c.length;) {
//            System.out.println(i);

            if (energy == 0 || i == 0 && !firstIteration) {
                return energy;
            }

            if (c[i] == 1) {
                energy -= 2;
            }

            if ((i + k) == c.length) {
                firstIteration = false;

                i = 0;
            } else if ((i +k) > c.length){
                firstIteration = false;

                int kAdjustment = 0;

                for (int position = i; position < c.length; position++) {
                    kAdjustment++;
                }

                i = 0;

                i += k - kAdjustment;

            } else {
                i += k;
            }

            energy--;
        }


        return 1;
    }
}
