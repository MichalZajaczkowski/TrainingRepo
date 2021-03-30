package com.infoshareacademy;

import com.infoshareacademy.vehicle.Car;
import com.infoshareacademy.vehicle.Engine;

public class App {

    public static void main(String[] args) {
// ex8
        Car car1 = new Car("car1");
        car1.setMaxSpeed(110);
        Car car2 = new Car("car2");
        car2.setMaxSpeed(250);

        if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
            System.out.println(car1.getName());
            car1.setName("faster car");

        } else if (car2.getMaxSpeed() > car1.getMaxSpeed()) {
            System.out.println(car2.getName());
            car2.setName("faster car ");
        }
        System.out.println("car1: " + car1.getName() + ", car2: " + car2.getName());
    }
}
