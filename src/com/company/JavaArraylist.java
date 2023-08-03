package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> lines = new ArrayList<>();

        int numberOfLines = scanner.nextInt();

        scanner.nextLine();

        while (numberOfLines > 0) {
            List<Integer> newList = new ArrayList<>();
            String line = scanner.nextLine().trim();

            String[] newLine = line.split(" ");

            for (int i = 0; i < newLine.length; i++) {

                newList.add(Integer.parseInt(newLine[i]));
            }

            lines.add(newList);
            numberOfLines--;
        }

        int queryCount = scanner.nextInt();

        scanner.nextLine();

        while (scanner.hasNext()) {
            String query = scanner.nextLine();
            String[] splitQuery = query.split(" ");


            try {
                System.out.println(
                        lines
                                .get(Integer.parseInt(splitQuery[0]) - 1)
                                .get(Integer.parseInt(splitQuery[1]))
                );
            } catch (Exception err) {
                System.out.println("ERROR!");
            }
        }

    }}
