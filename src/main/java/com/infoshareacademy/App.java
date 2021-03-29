package com.infoshareacademy;

public class App {

    public static void main(String[] args) {

// ex3
        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod();

        StaticExample.staticMethod();
    }
}
