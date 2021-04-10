package com.infoshareacademy.Animals;

public interface Animal {
    void eat();

    default void defaultImplementationAnimal(){
        System.out.println("metoda domyślna w interface Animal ");
    }
}
