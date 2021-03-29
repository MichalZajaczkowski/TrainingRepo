package com.infoshareacademy;

public class Car {
    public String name;
    public int maxSpeed;

    public Car() {

    }
    public Car(String name){
        this.name = name;
        maxSpeed = 150;
    }
    public void printName() {
        System.out.println(name);
    }
}
