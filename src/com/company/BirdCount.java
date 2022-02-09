package com.company;

import java.util.*;

public class BirdCount {
    //sort incoming array ascending
    //map array key = birdId value = occurance in array
    //while mapping generate largest occurance value
    //interate through map looking for value == largest
    //return first occurance of largest

    public static int migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);

        int finalBirdId = 0;

        int mostOccurrences = 0;

        Map<Integer, Integer> birdOccurrences = new HashMap<>();

        for (Integer bird : arr) {
            if (!birdOccurrences.containsKey(bird)) {
                birdOccurrences.put(bird, 1);
            } else {
                int count = birdOccurrences.get(bird);

                count++;

                birdOccurrences.put(bird, count);

                if (count > mostOccurrences) {
                    mostOccurrences = count;
                }
            }
        }

        for (Integer bird : new TreeSet<Integer>(birdOccurrences.keySet())) {
            if (birdOccurrences.get(bird) == mostOccurrences) {
                finalBirdId = bird;
                break;
            }
        }

        return finalBirdId;
    }

}
