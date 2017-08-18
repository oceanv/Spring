package com.hai.c_spel;

import com.hai.b_iocXml.Entry;

public class Relation {
    private Entry entry;
    private String entryName;
    private String entryMethod;
    private String entryMethodLink;

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public String getEntryMethod() {
        return entryMethod;
    }

    public void setEntryMethod(String entryMethod) {
        this.entryMethod = entryMethod;
    }

    public String getEntryMethodLink() {
        return entryMethodLink;
    }

    public void setEntryMethodLink(String entryMethodLink) {
        this.entryMethodLink = entryMethodLink;
    }

    @Override
    public String toString() {
        return "Relation{" +
                "entry=" + entry +
                ", entryName='" + entryName + '\'' +
                ", entryMethod='" + entryMethod + '\'' +
                ", entryMethodLink='" + entryMethodLink + '\'' +
                '}';
    }
}
