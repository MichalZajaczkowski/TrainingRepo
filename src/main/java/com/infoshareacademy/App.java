package com.infoshareacademy;

public class App {

    public static void main(String[] args) {

// ex1a
        Engine engine1 = new Engine();
        Engine engine2 = new Engine();

        engine1.power = 150;
        engine1.capacity = 2500;

        engine2.power = 250;
        engine2.capacity = 3500;

        System.out.println(engine1.power);
        System.out.println(engine1.capacity);
        System.out.println(engine2.power);
        System.out.println(engine2.capacity);
        System.out.println("+++++++++++++++++++");
// ex1b
        Car car1 = new Car("name");
        Car car2 = new Car();

        car1.engine = engine1;
        car2.name = "myCar2";
        car2.engine = engine2;

        car1.printName();
        car1.engine.printPower();
        car1.engine.printCapacity();
        car2.printName();
        car2.engine.printPower();
        car2.engine.printCapacity();
    }
}
