package com.infoshareacademy.interfaces;

public interface MyInterface {
    Integer CONSTANT = 2;
    void printMessage();
    int generateNumber(int range);


    default void printImpl() {
        System.out.println("metoda w interface" + " / " + getClass().getSimpleName());
    }
}
