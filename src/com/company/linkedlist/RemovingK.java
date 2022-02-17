package com.company.linkedlist;

public class RemovingK {
    // Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
//    ListNode<Integer> solution(ListNode<Integer> l, int k) {
//        if (l.value == k){
//            ListNode<Integer> next = l.next;
//            l = null;
//
//            if (next != null) {
//                solution(next, k);
//            } else {
//                return l;
//            }
//
//        } else if (l.next == null) {
//            return l;
//        }else {
//            if (l.next.value.equals(k)) {
//                l.next = l.next.next;
//            }
//
//            if (l.next != null) {
//
//                solution(l.next, k);
//            } else {
//                return l;
//            }
//        }
//
//
//        // System.out.println(l.next.next.next.next.next.next == null);
//
//        return l;
//    }

    //Attempt 2

    // Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }

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

        System.out.println("Is this reached every time?");
        System.out.println(l.value);
        return l;

    }


}
