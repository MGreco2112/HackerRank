package com.company.linkedlist;

public class RemovingK {


    ListNode solution(ListNode l, int k) {
    /*
    Check if current l.value == k
        if so and l.next != null, set variable to l.next, set l to null, run method on var containing l.next
    check if l.next == null
        if so return l
        else run method on l.next
    */


        if (l == null) {
            return null;
        }

        // System.out.println(l.value);

        if (l.value == k && l.next != null) {
            // System.out.println(l.value == 3);

            ListNode next = l.next;

            return solution(next, k);
        } else if (l.value == k) {


            return null;
        } else if (l.next == null) {

            return l;
        } else {

            l.next = solution(l.next, k);
        }


        return l;
    }
}
