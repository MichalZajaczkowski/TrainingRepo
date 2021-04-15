package com.infoshareacademy.ex353637;

public class C extends B{
    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void metodaD() {
        super.metodaD();
        System.out.println("@Override metodyD w metodzie C z interface D ");
    }
}
