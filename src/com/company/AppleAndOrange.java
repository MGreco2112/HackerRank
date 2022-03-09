package com.company;

import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int houseStart, int houseEnd, int appleTreeLocation, int orangeTreeLocation, List<Integer> apples, List<Integer> oranges) {
        // Write your code here

        /*
        for each apple/orange add each fruit value to respective tree location
        if that value >= houseStart && <= houseEnd increment housesOnTree of each fruit
        return housesOnTree for each individual fruit
        */

        int applesOnHouse = 0;
        int orangesOnHouse = 0;

        for (Integer apple : apples) {
            if (apple + appleTreeLocation >= houseStart &&
                    apple + appleTreeLocation <= houseEnd) {
                applesOnHouse++;
            }
        }

        for (Integer orange : oranges) {
            if (orange + orangeTreeLocation >= houseStart &&
                    orange + orangeTreeLocation <= houseEnd) {
                orangesOnHouse++;
            }
        }

        System.out.println(applesOnHouse + "\n" + orangesOnHouse);
    }
}
