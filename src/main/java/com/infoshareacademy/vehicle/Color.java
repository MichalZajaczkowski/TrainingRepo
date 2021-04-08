package com.infoshareacademy.vehicle;

public enum Color {
    RED("czerwony"),
    GREEN("zielony"),
    BLUE("niebieski");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}