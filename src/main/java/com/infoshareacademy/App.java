package com.infoshareacademy;

import com.infoshareacademy.Animals.Cat;
import com.infoshareacademy.Animals.Dog;
import com.infoshareacademy.vehicle.Car;
import com.infoshareacademy.vehicle.Vehicle;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();
        car.printID();
        vehicle.printID();
    }
}