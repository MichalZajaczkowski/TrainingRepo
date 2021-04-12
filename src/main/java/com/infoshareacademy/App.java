package com.infoshareacademy;

import com.infoshareacademy.vehicle.Car;

public class App {
    public static void main(String[] args) {
        MyGenericType t1 = new MyGenericType("string");
        MyGenericType t2 = new MyGenericType(new Car());

        t1.printItemType();
        t2.printItemType();

        if (t2.getItem() instanceof Car) {
            ((Car)t2.getItem()).setMaxSpeed(120);
        }
    }
}