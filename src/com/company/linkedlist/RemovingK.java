package com.company.linkedlist;

public class RemovingK {


    //Set each return value to = l.next;

    public static ListNode solution(ListNode l, int k) {
    /*
    Check if current l.value == k
        if so and l.next != null, set variable to l.next, set l to null, run method on var containing l.next
    check if l.next == null
        if so return l
        else run method on l.next
    */

         System.out.println(l);

        if (l == null) {
            System.out.println("This is null");
            return l;
        } else if (l.value == k && l.next != null) {
            System.out.println("Next is not Null");

             System.out.println(l.value);

            System.out.println(l.value == 3);

            ListNode next = l.next;

            l = null;

            return solution(next, k);
        } else if (l.value == k) {
            System.out.println("Next is Null");

             System.out.println(l.value);

            l = null;

            return l;
        } else {
             System.out.println("Not Removed");
             System.out.println(l.value);

            solution(l.next, k);
        }

        System.out.println("Results not removed");
        System.out.println(l.value);
        return l;

    }


}
