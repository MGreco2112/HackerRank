package com.company;

import java.util.List;

public class Hourglass {

    class Result {

        /*
         * Complete the 'hourglassSum' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
         */

        public static int hourglassSum(List<List<Integer>> arr) {
            int max = Integer.MIN_VALUE;

            int arrayLevel = 0;

            int topGlass = 0;

            int midGlass = 1;

            int bottomGlass = 0;

            while (arrayLevel < arr.size() - 2) {
                int currentGlass = 0;

                if (topGlass < arr.get(arrayLevel).size() - 2) {

                    currentGlass += arr.get(arrayLevel).get(topGlass) + arr.get   (arrayLevel).get(topGlass + 1) + arr.get(arrayLevel).get(topGlass + 2) + arr.get(arrayLevel + 1).get(midGlass) + arr.get(arrayLevel + 2).get(bottomGlass) + arr.get(arrayLevel + 2).get(bottomGlass + 1) + + arr.get(arrayLevel + 2).get(bottomGlass + 2);

                    topGlass++;
                    midGlass++;
                    bottomGlass++;

                    System.out.println(currentGlass);


                    if (currentGlass > max) {
                        max = currentGlass;
                    }

                } else {
                    topGlass = 0;
                    midGlass = 1;
                    bottomGlass = 0;
                    arrayLevel++;
                }


            }

            return max;
        }

    }


}
