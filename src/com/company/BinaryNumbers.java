package com.company;

public class BinaryNumbers {
    public static void main(String[] args) {
        int n = 439;

        String result = "";

        int consecOnes = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                result += 1;
            } else {
                result += 0;
            }

            n = n / 2;
        }



        int currentRun = 0;

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '1') {
                currentRun++;
            }

            if (currentRun > consecOnes) {
                consecOnes = currentRun;
            }

            if (i + 1 != result.length() && result.charAt(i + 1) != '1') {
                currentRun = 0;
            }
        }

        System.out.println(consecOnes);
    }


}
