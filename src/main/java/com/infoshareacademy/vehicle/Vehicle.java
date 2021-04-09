package com.infoshareacademy.vehicle;

import java.util.Random;

public class Vehicle {
    private Long id;
    private Random random = new Random();

    public void printID(){
        id = generateNumber(0, 99999999);
        System.out.println(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long generateNumber(int min, int max) {
        return random.longs(min, max)
                .findFirst()
                .getAsLong();
    }
}
