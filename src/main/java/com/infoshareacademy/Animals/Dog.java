package com.infoshareacademy.Animals;

public class Dog extends AbstractAnimal implements Animal{
    @Override
    public void printAnimalName() {
        System.out.println("pies");

    }

    @Override
    public void eat() {

    }

    @Override
    public void defaultImplementationAnimal() {
        Animal.super.defaultImplementationAnimal();
    }
}
