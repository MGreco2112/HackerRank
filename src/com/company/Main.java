package com.company;

import com.company.linkedlist.IsPalindrome;
import com.company.linkedlist.ListNode;
import com.company.linkedlist.RemovingK;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	    String str = "(()";
//
//        System.out.println(BalancedBrackets.isBalanced(str));
//
//        List<List<Integer>> container = new ArrayList<>();
//
//        container.add(new ArrayList<>());
//        container.add(new ArrayList<>());
//        container.add(new ArrayList<>());
//
//        container.get(0).add(0);
//        container.get(0).add(2);
//        container.get(0).add(1);
//
//        container.get(1).add(1);
//        container.get(1).add(1);
//        container.get(1).add(1);
//
//        container.get(2).add(2);
//        container.get(2).add(0);
//        container.get(2).add(0);
//
//        System.out.println(ContainersOfBalls.organizingContainers(container));

//        List<Integer> birds = new ArrayList<>();
//
//        birds.add(1);
//        birds.add(1);
//        birds.add(1);
//        birds.add(2);
//        birds.add(2);
//        birds.add(2);
//
//        System.out.println(BirdCount.migratoryBirds(birds));

//        int[] clouds = {0, 0, 1, 0, 0, 1, 1, 0};
//
//        int jumps = 2;
//
//        System.out.println(JumpingCloudsRedux.jumpingOnClouds(clouds, jumps));


//        System.out.println(SherlockAndAnagrams.sherlockAndAnagrams("abba"));

        // l = [3, 1, 2, 3, 4, 5]

        ListNode head = new ListNode(0);

        head.next = new ListNode(1);
        head.next.next = new ListNode(0);

        System.out.println(IsPalindrome.solution(head));


    }
}
