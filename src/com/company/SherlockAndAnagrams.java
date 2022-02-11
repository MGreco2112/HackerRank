package com.company;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

    /*
       Iterate through input String and generate a hashmap containing key=character value=occurrences
     */

    public static int sherlockAndAnagrams(String s) {
        Map<String, Integer> frequency = new HashMap<>();

        for (String cha : s.split("")) {
            if (frequency.containsKey(cha)) {
                int chaFrequency = frequency.get(cha);

                chaFrequency++;

                frequency.put(cha, chaFrequency);
            } else {
                frequency.put(cha, 1);
            }
        }

        System.out.println(frequency);



        return 1;
    }

}
