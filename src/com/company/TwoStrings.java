package com.company;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {
    public static String twoStrings(String s1, String s2) {
        Map<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (letters.containsKey(s1.charAt(i))) {
                int count = letters.get(s1.charAt(i));

                count++;

                letters.put(s1.charAt(i), count);
            } else {
                letters.put(s1.charAt(i), 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (letters.containsKey(s2.charAt(i))) {
                return "YES";
            }
        }


        return "NO";
    }
}
