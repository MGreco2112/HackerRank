package com.company;

public class HouseRobber {
    int solution(int[] nums) {
        //iterate through nums
        //isolte the first two indexes
        //if first iso > second iso
        //total += first iso, i+= 2;
        //else
        //total += second iso, i+= 3;

        // int total = 0;

        // for (int i = 0; i < nums.length;) {
        //     int nextHouseIndex = i + 1;

        //     if (i + 1 < nums.length) {
        //         if (nums[i] >= nums[nextHouseIndex]) {
        //             total += nums[i];

        //             i += 2;
        //         } else {
        //             total += nums[nextHouseIndex];

        //             i += 3;
        //         }
        //     } else {
        //         total += nums[i];

        //         i++;
        //     }
        // }


        // return total;


        //new solution
    /*
    iterate through the array taking the selected index and subtracting the total of the surrounding indexes
    store the index and value of the least loss value
    set the index value of the taken int to -1
    add the value to the taken value
    */

        // int total = 0;

        // int currentIteration = 0;

        // while (currentIteration < nums.length) {
        //     int[][] differences = new int[nums.length][2];
        //     int leastLoss = Integer.MIN_VALUE;

        //     differences[i][0] = i;

        //     for (int i = 0; i < nums.length; i++) {
        //         if (i - 1 > -1 && i + 1 < nums.length) {
        //             differences[i][1] = nums[i] - nums[i - 1] - nums[i + 1];
        //         } else if (i - 1 < 0) {
        //             differences[i][1] = nums[i] - nums[i + 1];
        //         } else {
        //             differences[i][1] = nums[i] - nums[i - 1];
        //         }

        //         if (differences[i][1] > leastLoss) {
        //             leastLoss = differences[i][1];
        //         }
        //     }


        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] cache = new int[nums.length];

        cache[0] = nums[0];
        cache[1] = Math.max(nums[0], nums[1]);

        for (int pointer = 2; pointer < nums.length; pointer++) {
            cache[pointer] = Math.max(nums[pointer] + cache[pointer - 2], cache[pointer - 1]);
        }


        return cache[cache.length - 1];







    }

}
