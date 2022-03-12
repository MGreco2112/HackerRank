package com.company;

public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }





    }


    public Node insert(Node head, int data) {
        // System.out.println(head.data);

        if (head == null) {
            head = new Node(data);
            return head;
        } else {
            head.next = insert(head.next, data);
        }


        return head;

    }


}