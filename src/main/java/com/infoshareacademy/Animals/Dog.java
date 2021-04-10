package com.infoshareacademy.Animals;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat food");
    }

    @Override
    public void defaultImplementationAnimal() {
        System.out.println("nadpisana metoda domyslna w klasie DOG z interface Animal");
    }
}
