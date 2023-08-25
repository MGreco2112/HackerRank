package com.company;

import java.util.Scanner;

public class JavaReverseString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int revPointer = A.length() - 1;

        int halfLength = A.length() / 2;

        for (int i = 0; i < halfLength; i++, revPointer--) {
            if (A.charAt(i) != A.charAt(revPointer)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }
}
