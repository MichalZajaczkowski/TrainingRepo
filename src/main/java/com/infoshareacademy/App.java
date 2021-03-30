package com.infoshareacademy;

import com.infoshareacademy.vehicle.Car;
import com.infoshareacademy.vehicle.Engine;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nazwa samochodu");
        String name = scanner.nextLine();
        System.out.println("moc silnika");
        Integer enginePower = scanner.nextInt();

        Engine engine = new Engine();
        engine.setPower(enginePower);
        Car car = new Car();
        car.setName(name);
        car.setEngine(new Engine());
        car.setEngine(engine);

        car.printName();
        car.getEngine().printPower();
    }
}