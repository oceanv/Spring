package com.hai.b_iocXml.c_autowire;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireTest {

    private ApplicationContext context;

    @Before
    public  void init() {
        context = new ClassPathXmlApplicationContext("beans-ioc.xml");
    }

    @Test
    public void testManual() {
        AutoWire auto = (AutoWire) context.getBean("autoWire");
        System.out.println(auto);
    }

    @Test
    public void testAutoWireByName() {
        AutoWire auto = (AutoWire) context.getBean("autoWire1");
        System.out.println(context.getBean("str"));
        System.out.println(auto);
    }
}