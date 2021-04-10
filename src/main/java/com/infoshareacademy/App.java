package com.infoshareacademy;

import com.infoshareacademy.Animals.Cat;
import com.infoshareacademy.Animals.Dog;

public class App {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        cat.eat();
    }
}