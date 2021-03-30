package com.infoshareacademy;

import com.infoshareacademy.vehicle.Car;
import com.infoshareacademy.vehicle.Engine;

public class App {

    public static void main(String[] args) {
// ex8
        Car car1 = new Car("car1");
        car1.setMaxSpeed(110);
        Car car2 = new Car("car2");
        car2.setMaxSpeed(110);

        getNameOfFasterCar(car1, car2);
    }

    private static void getNameOfFasterCar(Car car1, Car car2) {
        if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
            car1.printName();
            car1.setName("faster car");

        } else if (car2.getMaxSpeed() > car1.getMaxSpeed()) {
            car2.printName();
            car2.setName("faster car ");
        } else {
            System.out.println("prędkości takie same");
        }
        System.out.println("car1: " + car1.getName() + ", car2: " + car2.getName());
    }
}
