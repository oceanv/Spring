package com.hai.d_cycle;

public class Cycle {
    public Cycle() {
        System.out.println("bean constructor called....");
    }

    private String string;
    public void setString(String string) {
        System.out.println("bean setter called....");
        this.string = string;
    }

    public void init() {
        System.out.println("init method called...");
    }

    public void destroy() {
        System.out.println("destroy method called ...");
    }
}
