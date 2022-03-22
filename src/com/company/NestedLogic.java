package com.company;

import java.util.Scanner;

public class NestedLogic {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        scanner.nextLine();

        int rtnDay = scanner.nextInt();
        int rtnMonth = scanner.nextInt();
        int rtnYear = scanner.nextInt();

        scanner.close();


        if (year > rtnYear) {
            System.out.println(10000);
            return;
        }

        if (year == rtnYear && day > rtnDay && month == rtnMonth) {
            System.out.println(15 * Math.abs(day - rtnDay));
            return;
        } else if (year == rtnYear && day > rtnDay && month > rtnMonth ) {
            System.out.println(500 * Math.abs(month - rtnMonth));
            return;
        }


        System.out.println(0);
    }
}
