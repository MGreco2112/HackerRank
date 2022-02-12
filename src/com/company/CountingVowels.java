package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingVowels {

    public static int countingVowels(String str, int n) {
        if (n == 1) {
            return vowels(str.charAt(n - 1));
        } else {
            return countingVowels(str, n - 1) + vowels(str.charAt(n - 1));
        }
    }

    private static int vowels(char ch) {

        char lower = Character.toLowerCase(ch);

        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
            return 1;
        } else {
            return 0;
        }
    }


}
