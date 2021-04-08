package com.infoshareacademy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Podaj liczbę zmiennoprzecinkową");
            double scannerDouble = scanner.nextDouble();
            System.out.println(scannerDouble);
        } catch (InputMismatchException e){
            System.out.println("Podałeś błędna wartość ");
        }
    }
}