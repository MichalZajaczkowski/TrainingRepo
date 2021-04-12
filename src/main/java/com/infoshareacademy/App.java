package com.infoshareacademy;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++Mapa+++++++++++++++++");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "b");
        map.put(2, "d");
        map.put(7, "a");
        map.put(5, "e");
        map.put(9, "f");
        System.out.println("Map size: " + map.size());
        System.out.println("map K: " + map.keySet());
        System.out.println("map V: " + map.values());
        System.out.println("hashCode: " + map.hashCode());
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }

/*
        System.out.println("++++++++++++++++Set+++++++++++++++++");
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
            System.out.println("set: " + i);
            System.out.println("hashCode: " + i.hashCode());
        }


        System.out.println("++++++++++++++++List+++++++++++++++++");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(9);

        System.out.println("list size: " + list.size());
        for (Integer j :
                list) {
            System.out.println("list: " + j);
            System.out.println("hashCode: " + j.hashCode());
        }*/
    }
}