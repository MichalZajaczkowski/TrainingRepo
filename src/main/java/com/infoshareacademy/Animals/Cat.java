package com.infoshareacademy.Animals;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("cat food");
    }

    @Override
    public void defaultImplementationAnimal() {
        Animal.super.defaultImplementationAnimal();
    }
}
