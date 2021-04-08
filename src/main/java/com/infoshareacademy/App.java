package com.infoshareacademy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner;

        boolean flag = true;
        while (flag) {
            try {
                scanner = new Scanner(System.in);
                int i = scanner.nextInt();
                System.out.println("podano: " + i);
                flag = false;
                //break;
            }catch (InputMismatchException e) {
                System.out.println("podałeś błędne dane");
            }
        }
    }
}