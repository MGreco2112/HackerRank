package com.company;

public class NumberLineJumps {
    public static String kangaroo(int kangaStart1, int kangaJump1, int kangaStart2, int kangaJump2) {
        // Write your code here
        while (kangaStart1 <= kangaStart2) {
            if (kangaStart1 == kangaStart2) {
                return "YES";
            }

            kangaStart1 += kangaJump1;
            kangaStart2 += kangaJump2;
        }

        return "NO";
    }

}
