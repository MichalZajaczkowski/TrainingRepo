package com.infoshareacademy;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();

        System.out.println("countDotsWithArray: " + countDotsWithArray(nextLine));
        System.out.println("countDotsWithReplace: " + countDotsWithReplace(nextLine));
    }

    private static int countDotsWithReplace(String nextLine) {
        int baseLength = nextLine.length();
        String replace = nextLine.replace(".", "");
        int replaceLength = replace.length();
        return  baseLength - replaceLength;
    }

    private static int countDotsWithArray(String nextLine) {
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