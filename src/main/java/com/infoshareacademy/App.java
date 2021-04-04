package com.infoshareacademy;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();

        System.out.println(countDots(nextLine));
    }

    private static int countDots(String nextLine) {
        char[] chars = nextLine.toCharArray();
        int counter = 0;
        for (int i =0; i < chars.length; i++) {
            if (chars[i] == '.') {
                counter++;
            }
        }
        return counter;
    }
}