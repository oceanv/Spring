package com.hai.b_iocXml.b_value;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionValueTest {
    private ApplicationContext context;

    @Before
    public  void init() {
        context = new ClassPathXmlApplicationContext("beans-ioc.xml");
    }

    @Test
    public void testSpecialChar() throws Exception {
        System.out.println(context.getBean("injectionValue1"));
    }

    @Test
    public void testRefObject() throws Exception {
        System.out.println(context.getBean("injectionValue2"));
    }

    @Test
    public void testCreateObject() throws Exception {
        System.out.println(context.getBean("injectionValue3"));
    }

    @Test
    public void testNullObject() throws Exception {
        System.out.println(context.getBean("injectionValue4"));
    }

    @Test
    public void testList() throws Exception {
        System.out.println(context.getBean("injectionValue5"));
    }

    @Test
    public void testMap() throws Exception {
        System.out.println(context.getBean("injectionValue6"));
    }

    @Test
    public void testProperties() throws Exception {
        System.out.println(context.getBean("injectionValue7"));
    }

    @Test
    public void testListOutDefine() throws Exception {
        System.out.println(context.getBean("injectionValue8"));
    }

    @Test
    public void testMapOutDefine() throws Exception {
        System.out.println(context.getBean("injectionValue9"));
    }

    @Test
    public void testPropertiesOutDefine() throws Exception {
        System.out.println(context.getBean("injectionValue10"));
    }

    @Test
    public void testPNameSpace() throws Exception {
        InjectionValue val = (InjectionValue) context.getBean("injectionValue11");
        System.out.println(val.getProperties().get("name"));
    }
}