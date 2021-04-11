package com.infoshareacademy;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(7);
        set.add(5);
        set.add(9);

        System.out.println("set size: " + set.size());
        for (Integer i : set) {
            System.out.println(i);
            System.out.println("hashCode: " + i.hashCode());
        }
    }
}