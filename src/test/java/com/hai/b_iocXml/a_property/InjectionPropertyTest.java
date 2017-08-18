package com.hai.b_iocXml.a_property;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionPropertyTest {

    private ApplicationContext context;

    @Before
    public  void init() {
        context = new ClassPathXmlApplicationContext("beans-ioc.xml");
    }

    @Test
    public void testSetterInjectionProperty() throws Exception {
        System.out.println(context.getBean("setterInjectionProperty"));
    }

    @Test
    public void testConstructorInjectionProperty1() {
        System.out.println(context.getBean("constructorInjectionProperty1"));
    }

    @Test
    public void testConstructorInjectionProperty2() {
        System.out.println(context.getBean("constructorInjectionProperty2"));
    }

    @Test
    public void testConstructorInjectionProperty3() {
        System.out.println(context.getBean("constructorInjectionProperty3"));
    }

}