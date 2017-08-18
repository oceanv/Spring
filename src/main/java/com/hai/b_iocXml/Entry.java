package com.hai.b_iocXml;

public class Entry {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public Entry(){};

    public Entry(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "name='" + name + '\'' +
                '}';
    }
}
