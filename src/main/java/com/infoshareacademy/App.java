package com.infoshareacademy;

import com.infoshareacademy.vehicle.Car;
import com.infoshareacademy.vehicle.Engine;

public class App {

    public static void main(String[] args) {
// ex4
        Car car1 = new Car();
        Car car2 = new Car();

        Engine engine1 = new Engine();
        Engine engine2 = new Engine();

        engine1.setPower(150);
        engine1.setCapacity(1500);
        engine2.setPower(254);
        engine2.setCapacity(2462);

        car1.setName("car1");
        car1.setEngine(engine1);
        car1.setMaxSpeed(155);

        car1.printName();
        car1.getEngine().printPower();
        car1.getEngine().printCapacity();
        car1.printMaxSpeed();
        System.out.println("+++++++++++++++");
        car2.setName(car2.getName());
        car2.setEngine(engine2);
        car2.setMaxSpeed(255);

        car2.printName();
        car2.getEngine().printPower();
        car2.getEngine().printCapacity();
        car2.printMaxSpeed();
    }
}
