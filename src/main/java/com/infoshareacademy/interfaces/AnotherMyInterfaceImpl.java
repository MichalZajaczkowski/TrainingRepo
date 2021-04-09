package com.infoshareacademy.interfaces;

public class AnotherMyInterfaceImpl implements MyInterface{
    @Override
    public void printMessage() {
        System.out.println("another message");
    }

    @Override
    public int generateNumber(int range) {
        return 4;
    }
}
