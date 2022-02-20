package com.company.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class HugeNumbers {
    public static ListNode solution(ListNode a, ListNode b) {
        List<Long> listA = ListBuilder(a);
        List<Long> listB = ListBuilder(b);

        ListNode newNode = new ListNode(listA.get(0) + listB.get(0));

        for (int i = 1; i < listA.size(); i++) {
            ListNode nextNode = new ListNode(listA.get(i) + listB.get(i));

            ListNode pointer = newNode;

            while (pointer.next != null) {
                pointer = pointer.next;
            }

            pointer.next = nextNode;
        }

        return newNode;
    }

    private static List<Long> ListBuilder(ListNode l) {
        if (l == null) {
            return new ArrayList<>();
        } else {
            List<Long> results = ListBuilder(l.next);

            results.add((long) l.value);

            return results;
        }
    }

}
