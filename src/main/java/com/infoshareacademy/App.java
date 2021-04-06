package com.infoshareacademy;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        nextLine = nextLine.trim();

        String[] split = nextLine.split(" ");

        int counter = 0;
        for (int i = 0; i < split.length; i++){
            if (split[i].isEmpty()) {
                continue;
            }
            counter++;
            System.out.println(split[i]);
        }
        System.out.println(counter);
    }
}