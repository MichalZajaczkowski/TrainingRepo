package com.infoshareacademy;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        MyEnum myEnum = MyEnum.B;
        System.out.println(myEnum);
        System.out.println(myEnum.ordinal());

        MyEnum[] values = MyEnum.values();
        for (int i =0; i< values.length; i++) {
            System.out.println(values[i]);
        }

        MyEnum myEnum1 = MyEnum.valueOf("A");
        System.out.println(myEnum1);
        System.out.println(myEnum1.ordinal());
    }
}