package com.hai.b_iocXml.c_autowire;

import com.hai.b_iocXml.Entry;

public class AutoWire {
    private String str;
    private Entry entry;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "AutoWire{" +
                "str='" + str + '\'' +
                ", entry=" + entry +
                '}';
    }
}
