package com.infoshareacademy;

import com.infoshareacademy.vehicle.Car;
import com.infoshareacademy.vehicle.Engine;

public class App {

    public static void main(String[] args) {

        System.out.println("++++++++++while++++++++++"); // kiedy nie znamy ilości obiegów pętli
        Integer i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("++++++++++doWhile++++++++++");
        Integer q = 5;
        do {
            q--;
            System.out.println(q);
        } while (q > 0);
        System.out.println("++++++++++for++++++++++");// kiedy  znamy ilość obiegów pętli
        Integer ln = 4;
        for (int j = 0; j < ln; j++) {
            System.out.println(j);
        }

        System.out.println("++++++++++continue / break++++++++++");// kiedy  znamy ilość obiegów pętli
        number11(15);
    }

    public static void number11(int a) {
        for (int j = 0; j < a; j++) {
            if (j % 2 == 0) {
                continue;
            }
            if (j % 11 == 0) {
                break;
            }
            System.out.println(j);
        }
    }
}