package com.infoshareacademy.vehicle;

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
}
