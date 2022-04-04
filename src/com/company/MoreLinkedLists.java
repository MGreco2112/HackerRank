package com.company;

public class MoreLinkedLists {
//    public static Node removeDuplicates(Node head) {
//        //Write your code here
//
//        Set<Integer> values = new HashSet<>();
//
//        Node pointer = head;
//
//        while (pointer != null) {
//            values.add(pointer.data);
//
//            pointer = pointer.next;
//        }
//
//        List<Integer>sortedSet = new ArrayList<>(values);
//
//        Collections.sort(sortedSet);
//
//        Node newPointer = null;
//        Node newHead = null;
//
//        for (Integer num : sortedSet) {
//            Node newNode = new Node(num);
//
//            if (newPointer != null) {
//                newPointer.next = newNode;
//                newPointer = newNode;
//            } else {
//                newHead = newNode;
//                newPointer = newNode;
//            }
//
//        }
//
//
//        return newHead;
//
//    }


    //New, better solution
//    public static Node removeDuplicates(Node head) {
//        List<Integer> values = new ArrayList<>();
//
//        Node pointer = head;
//
//        while(pointer != null) {
//            if (!values.contains(pointer.data)) {
//                values.add(pointer.data);
//            }
//
//            pointer = pointer.next;
//        }
//
//        Node newHead = new Node(values.get(0));
//
//        Node pointer2 = newHead;
//
//        for (int i = 1; i < values.size(); i++) {
//            Node newNode = new Node(values.get(i));
//
//            pointer2.next = newNode;
//
//            pointer2 = pointer2.next;
//        }
//
//        return newHead;
//
//    }
}
