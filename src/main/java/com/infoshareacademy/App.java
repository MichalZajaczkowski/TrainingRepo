package com.infoshareacademy;

import com.infoshareacademy.inheritance.A;
import com.infoshareacademy.inheritance.B;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Scanner;

public class App {

    public static final Path RESOURCES = Paths.get("src", "main", "resources");

    public static void method(A a) {
        System.out.println(a.getClass().getSimpleName());
    }

    public static void main(String[] args) {

        B b = new B();
        b.getA();
        b.getB();

        A a = new A();
        a.getA();

        method(a);
        method(b);
    }
}