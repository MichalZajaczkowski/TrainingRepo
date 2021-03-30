package com.infoshareacademy;

import com.infoshareacademy.vehicle.Car;
import com.infoshareacademy.vehicle.Engine;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Car car = biuldCarFromUserInput();
        printCar(car);
    }

    private static void printCar(Car car) {
        car.printName();
        car.getEngine().printPower();
    }

    private static Car biuldCarFromUserInput() {
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
        return car;
    }
}