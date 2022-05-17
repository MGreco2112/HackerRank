package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> newList = new ArrayList<>();

        Integer[] moved = new Integer[d];

        for (int i = 0; i < d; i++) {
            moved[i] = a.get(i);
        }

        for (int i = 0 + d; i < a.size(); i++) {
            newList.add(a.get(i));
        }

        newList.addAll(Arrays.asList(moved));


        return newList;
    }

}
