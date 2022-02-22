package com.company.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergingLinkedLists {

    public static ListNode solution(ListNode l1, ListNode l2) {
        List<ListNode> listA = listBuilder(l1);
        List<ListNode> listB = listBuilder(l2);

        listA.addAll(listB);




        return null;
    }


    private static List<ListNode> listBuilder(ListNode l) {
        if (l == null) {
            return new ArrayList<ListNode>();
        } else {
            List<ListNode> list = listBuilder(l.next);

            list.add(l);

            return list;
        }

    }
}
