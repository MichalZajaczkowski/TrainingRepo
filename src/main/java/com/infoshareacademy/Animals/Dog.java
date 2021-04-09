package com.infoshareacademy.Animals;

public class Dog extends Animal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eat food");
    }
}
