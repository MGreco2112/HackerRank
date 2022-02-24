package com.company.nodes.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        Node<Integer> head = null;
        head = addNode(head, 2);
        head = addNode(head, 8);
        head = addNode(head, 5);
        head = addNode(head, 9);

        assertResult(head.value == 2);
        assertResult(head.next.value == 8);
        assertResult(head.next.next.value == 5);
        assertResult(head.next.next.next.value == 9);

        displayList(head);

        System.out.println(find(head, 10));
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

    public static void displayList(Node<Integer> head) {
        //TODO homework 2, 8, 5, 9
        List<Integer> values = listBuilder(head);

        Collections.sort(values);

        StringBuilder display = new StringBuilder();

        for (int i = 0; i < values.size(); i++) {
            display.append(values.get(i));

            if (i < values.size() - 1) {
                display.append(", ");
            }
        }

        System.out.println(display);
    }

    private static List<Integer> listBuilder(Node<Integer> head) {
        if (head == null) {
            return new ArrayList<>();
        } else {
            List<Integer> result = listBuilder(head.next);

            result.add(head.value);

            return result;
        }
    }

    private static Node<Integer> find(Node<Integer> head, int query) {
        // descend list to find a node with the input query
        // return node if found, else return null
        if (head == null) {
            return null;
        } else {
            if (head.value == query) {
                return head;
            } else {
                find(head.next, query);
            }
        }

        return null;
    }

    public static void remove(Node<Integer> head, int query) {

    }
}
