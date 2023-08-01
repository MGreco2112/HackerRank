package com.company;

import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] aArray = a.toLowerCase().toCharArray();
        char[] bArray = b.toLowerCase().toCharArray();

        for (int i = 0; i < aArray.length; i++) {
            for (int j = 0; j < bArray.length; j++) {
                if (aArray[i] == bArray[j]) {
                    bArray[j] = '0';
                    break;
                }
            }
        }

        for (int i = 0; i < bArray.length; i++) {
            if (bArray[i] != '0') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
