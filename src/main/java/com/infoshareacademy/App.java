package com.infoshareacademy;

import com.infoshareacademy.abstraction.AbstractClass;
import com.infoshareacademy.abstraction.AbstractClassImpl;

public class App {

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClassImpl();
        abstractClass.printNumber();
        abstractClass.printType();
        abstractClass.printNumber();
    }
}