package com.company;

import jdk.jshell.EvalException;

import java.util.*;

public class SherlockAndAnagrams {

    /*
       Iterate through input String and generate a hashmap containing key=character value=occurrences
     */

    public static int sherlockAndAnagrams(String s) {
        Map<String, Integer> frequency = new HashMap<>();
        List<String> substrings = new ArrayList<>();
        List<Character> chars = new ArrayList<>();

        int result = 0;

//        for (String cha : s.split("")) {
//            if (frequency.containsKey(cha)) {
//                int chaFrequency = frequency.get(cha);
//
//                chaFrequency++;
//
//                frequency.put(cha, chaFrequency);
//            } else {
//                frequency.put(cha, 1);
//            }
//        }"hat" "h" "ha" "hat"

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                substrings.add(s.substring(i, j));
            }
        }


        for (String sub : substrings) {
            boolean containsSame = true;
            for (int i = 0; i < sub.length(); i++) {
                if (sub.charAt(0) != sub.charAt(i)) {
                    containsSame = false;
                }
                chars.add(sub.charAt(i));
                Collections.sort(chars);
            }
            String letters = "";
            for (int i = 0; i < chars.size(); i++) {
                letters += chars.get(i);
            }
            if (containsSame && letters.length() > 1) {
                result++;
            }
            System.out.println(letters);
            chars.clear();
            if (frequency.containsKey(letters)) {
                int count = frequency.get(letters);
                count++;
                frequency.put(letters, count);
            } else {
                frequency.put(letters, 1);
            }
        }

        System.out.println(substrings);
        System.out.println(frequency);


        for (String letters : frequency.keySet()) {
            if (frequency.get(letters) > 1) {

//                    System.out.println(letters);
//                    result += frequency.get(letters);
                    result += frequency.get(letters) - 1;


            }
        }

        return result;
    }

}
