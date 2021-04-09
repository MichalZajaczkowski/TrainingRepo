package com.infoshareacademy;

import com.infoshareacademy.Animals.Cat;
import com.infoshareacademy.Animals.Dog;
import com.infoshareacademy.interfaces.MyInterface;
import com.infoshareacademy.interfaces.MyInterfaceImpl;
import com.infoshareacademy.vehicle.Car;
import com.infoshareacademy.vehicle.Vehicle;

public class App {
    public static void main(String[] args) {

        MyInterface myInterface = new MyInterfaceImpl();
        MyInterfaceImpl myInterface1 = new MyInterfaceImpl();

        System.out.println(myInterface.generateNumber(15));
        myInterface1.printMessage();
    }
}