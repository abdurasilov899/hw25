package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println(symmetricDifference(set1, set2));
    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newSet = new HashSet<Integer>(set1);
        newSet.removeAll(set2);
        set2.removeAll(set1);
        newSet.addAll(set2);
        return newSet;
    }
}
