package com.infoshareacademy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static Map<Integer, List<String>> groupNames(String... names) {
        //adam, jan, piotr, kasia
        //3 jan, 4 adam, 5 piotr,kasia
        Map<Integer, List<String>> result = new HashMap<>();
        for (String name : names) {
            // pobranie klucza - czyl długosci imienia
            int key = name.length();//key
            //dodanie pustej listy jeśli pod danym kluczem nic nie ma
            result.putIfAbsent(key, new ArrayList<>());
            // dodanie listy z danego klucza - zawsze lista istnieje dzieki powyższej instrukcji
            List<String> value = result.get(key);
            // dodanie wartości do listy
            value.add(name);
            //nadpisanie wartosci pod danym kluczem
            result.put(key, value);
        }
        return result;
    }

    public static void main(String[] args) {

        Map<Integer, List<String>> map = groupNames("jan", "adam", "piotr", "kasia");
        System.out.println(map);
    }
}