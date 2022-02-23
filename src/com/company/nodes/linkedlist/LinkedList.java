package com.company.nodes.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        Node<Integer> head = null;
        head = addNode(head, 2);
        head = addNode(head, 8);
        head = addNode(head, 5);

        assertResult(head.value == 2);
        assertResult(head.next.value == 8);
        assertResult(head.next.next.value == 5);
    }

    private static void assertResult(boolean result) {
        if (result) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }

    private static Node<Integer> addNode(Node<Integer> head, int value) {
        if (head == null) {
            return new Node<>(value);
        } else {
            Node<Integer> trav = head;

            while (trav.next != null) {
                trav = trav.next;
            }

            trav.next = new Node<>(value);

            return head;
        }
    }

    public static void displayList() {
        //TODO homework
    }

    private static void find(Node<Integer> head, int query) {

    }

    public static void remove(Node<Integer> head, int query) {

    }
}
