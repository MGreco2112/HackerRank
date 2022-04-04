package com.company;

import java.util.Scanner;

public class RunningTimeAndComplexity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();



        for (int i = 0; i < cases; i++) {
            int test = scanner.nextInt();

            if (test <= 1) {
                System.out.println("Not prime");
                continue;
            } else {

                if (test == 2) {
                    System.out.println("Prime");
                    continue;
                }

                boolean isPrime = false;

                for (int j = 2; j <= test/2; j++) {

                    if ((test % j) != 0) {
                        isPrime = true;
                    } else {
                        isPrime = false;
                        break;
                    }
                }


                if (isPrime) {

                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
            }
        }



    }
}
