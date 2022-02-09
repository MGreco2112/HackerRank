package com.company;

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

        List<Integer> birds = new ArrayList<>();

        birds.add(1);
        birds.add(1);
        birds.add(1);
        birds.add(2);
        birds.add(2);
        birds.add(2);

        System.out.println(BirdCount.migratoryBirds(birds));
    }
}
