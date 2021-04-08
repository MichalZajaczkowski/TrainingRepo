package com.infoshareacademy;
public class App {

    public static void main(String[] args){

        printNames("asd", "34");
        System.out.println("");
        printNames("asd", "asad asd", "we", "235dqw");

        System.out.println("++++++++++++");

        printNames2("123", "asd1");
        System.out.println("");
        printNames2("1dxg3","123", "asd1", "adas");
    }

    private static void printNames(String... strings){

        for (int i = 0; i < strings.length; i++) {
            String q = strings[i];
            System.out.println(q);
        }

    }
    private static void printNames2(String... strings2) {
        for (String s : strings2) {
            System.out.println(s);
        }
    }
}