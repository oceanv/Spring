package com.hai.b_iocXml.a_bean;

import com.hai.b_iocXml.Entry;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法：实例工厂的方法，既需要创建工厂本身，在调用工厂的实例方法。
 */
public class InstanceFactory {

    private  Map<String, Entry> entryMap;

    public InstanceFactory() {
        entryMap = new HashMap<>();

        entryMap.put("entry1", new Entry("entry1"));
        entryMap.put("entry2", new Entry("entry2"));
    }


    public Entry getEntry(String name) {
        return entryMap.get(name);
    }
}
