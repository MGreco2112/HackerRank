package com.company.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {

    public static boolean solution(ListNode l) {
       List<Integer> list = test(l);

        for (int i = 0; i < list.size(); i++) {
            int reverseIndex = list.size() - (1 - i);

            if (list.get(i) != list.get(reverseIndex)) {
                return false;
            }
        }

        return true;
    }

    private static List<Integer> test(ListNode l) {
        if (l == null) {
            return new ArrayList<>();
        } else {
            List<Integer> results = test(l.next);

            results.add(l.value);

            return results;
        }
    }
}
