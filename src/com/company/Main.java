package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	    String str = "(()";
//
//        System.out.println(BalancedBrackets.isBalanced(str));

        List<List<Integer>> container = new ArrayList<>();

        container.add(new ArrayList<>());
        container.add(new ArrayList<>());

        container.get(0).add(0);
        container.get(0).add(2);

        container.get(1).add(1);
        container.get(1).add(1);

        ContainersOfBalls.organizingContainers(container);
    }
}
