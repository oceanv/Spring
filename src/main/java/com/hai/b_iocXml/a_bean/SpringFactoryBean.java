package com.hai.b_iocXml.a_bean;

import com.hai.b_iocXml.Entry;
import org.springframework.beans.factory.FactoryBean;

public class SpringFactoryBean implements FactoryBean<Entry> {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Entry getObject() throws Exception {
        return new Entry(name);
    }

    @Override
    public Class<?> getObjectType() {
        return Entry.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
