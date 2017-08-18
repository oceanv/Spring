package com.hai.b_iocXml.d_relation;

import com.hai.b_iocXml.Entry;

public class Relation {
    private String string;

    private Entry entry;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "Relation{" +
                "string='" + string + '\'' +
                ", entry=" + entry +
                '}';
    }
}
