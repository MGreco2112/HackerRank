package com.company;

public class AlternatingCharacters {
    public static int alternatingCharacters(String s) {
        // Write your code here

        int delChars = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                delChars++;
            }
        }

        return delChars;

    }
}
