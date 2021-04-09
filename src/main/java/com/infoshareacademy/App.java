package com.infoshareacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Scanner;

public class App {

    public static final Path RESOURCES = Paths.get("src", "main", "resources");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        //String toFile = RESOURCES.toString().concat("\\input.txt");
        Path pathToFile = Paths.get(RESOURCES.toString(), "input.txt");
        //Path pathToFile = Paths.get(toFile);

        try {
            Files.writeString(pathToFile, inputText);
            String readString = Files.readString(pathToFile);

            System.out.println(readString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}