package com.hai.b_iocXml.e_scope;

import com.hai.b_iocXml.Entry;

public class Scope {
    private String name;
    private Entry entry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "Scope{" +
                "name='" + name + '\'' +
                ", entry=" + entry +
                '}';
    }
}
