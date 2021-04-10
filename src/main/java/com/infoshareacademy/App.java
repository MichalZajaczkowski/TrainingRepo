package com.infoshareacademy;

import com.infoshareacademy.Animals.Animal;
import com.infoshareacademy.Animals.Cat;
import com.infoshareacademy.Animals.Dog;
import com.infoshareacademy.interfaces.AnotherMyInterfaceImpl;
import com.infoshareacademy.interfaces.MyInterface;
import com.infoshareacademy.interfaces.MyInterfaceImpl;
import com.infoshareacademy.vehicle.Car;

public class App {

    private static void testInheritance(Animal animal) {
        animal.eat();
    }

    private static void testInterface(MyInterface myInterface) {
        myInterface.printImpl();
    }
    public static void main(String[] args) {


        MyInterfaceImpl myInterface
                = new MyInterfaceImpl();
        AnotherMyInterfaceImpl anotherMyInterface
                = new AnotherMyInterfaceImpl();

        Car car = new Car();

        testInterface(myInterface);
        testInterface(anotherMyInterface);
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        cat.eat();

        dog.defaultImplementationAnimal();
        cat.defaultImplementationAnimal();
    }
}