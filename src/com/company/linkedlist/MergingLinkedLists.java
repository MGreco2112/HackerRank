package com.company.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergingLinkedLists {

    public static ListNode solution(ListNode l1, ListNode l2) {
        List<Integer> listA = listBuilder(l1);
        List<Integer> listB = listBuilder(l2);

        if (listA.size() == 0 && listB.size() == 0) {
            return null;
        }

        listA.addAll(listB);

        Collections.sort(listA);

        ListNode head = new ListNode(listA.get(0));

        ListNode pointer = head;

        for (int i = 1; i < listA.size(); i++) {
            ListNode newNode = new ListNode(listA.get(i));

            pointer.next = newNode;

            pointer = newNode;
        }


        return head;
    }


    private static List<Integer> listBuilder(ListNode l) {
        if (l == null) {
            return new ArrayList<Integer>();
        } else {
            List<Integer> list = listBuilder(l.next);

            list.add(l.value);

            return list;
        }

    }
}
