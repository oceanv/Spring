package com.hai.b_iocXml.a_bean;

import com.hai.b_iocXml.Entry;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法：直接调用某一个类的静态方法就可以返回Bean的实例
 */
public class StaticFactory {

    private static Map<String, Entry> entryMap = new HashMap<>();
    static {
        entryMap.put("entry1", new Entry("entry1"));
        entryMap.put("entry2", new Entry("entry2"));
    }



    public static Entry getEntry(String name) {
        return entryMap.get(name);
    }
}
