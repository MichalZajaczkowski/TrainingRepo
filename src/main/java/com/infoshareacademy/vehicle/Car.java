package com.infoshareacademy.vehicle;

import java.util.Objects;

public class Car {
    private String name = "defoult";
    private Engine engine;
    private int maxSpeed;
    private Color color;


    public Car() {

    }
    public Car(String name){
        this.name = name;
        maxSpeed = 150;
    }
    public void printName() {
        System.out.println(name);
    }
    public void printMaxSpeed() {
        System.out.println(maxSpeed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Objects.equals(name, car.name) && Objects.equals(engine, car.engine) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine, maxSpeed, color);
    }
}
