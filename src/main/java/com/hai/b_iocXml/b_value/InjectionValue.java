package com.hai.b_iocXml.b_value;

import com.hai.b_iocXml.Entry;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class InjectionValue {
    private String str = "str";
    private Entry entry;
    private List<Entry> list;
    private Map<String, Entry> map;

    private Properties properties;

    public void setStr(String str) {
        this.str = str;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public void setList(List<Entry> list) {
        this.list = list;
    }

    public void setMap(Map<String, Entry> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    public Properties getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "InjectionValue{" +
                "str='" + str + '\'' +
                ", entry=" + entry +
                ", list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
