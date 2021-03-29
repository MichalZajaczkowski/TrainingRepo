package com.infoshareacademy;

public class App {

    public static void main(String[] args) {

        Car myCar = new Car("name");
        myCar.printName();

        Car myCr2 = new Car();
        myCr2.name = "myCar2";
        myCr2.printName();

    }
}
