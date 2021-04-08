package com.infoshareacademy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        Integer number = Integer.valueOf(nextLine);
        System.out.println(number * 3);
    }
}