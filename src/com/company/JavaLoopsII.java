package com.company;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            String aValues = "";

            for (int exp = 0; exp < n; exp++) {
                a += Math.pow(2, exp) * b;
                aValues += a + " ";
            }

            System.out.println(aValues);
        }
        in.close();
    }
}
