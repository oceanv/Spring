package com.hai.b_iocXml.d_relation;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RelationTest {
    private ApplicationContext context;

    @Before
    public  void init() {
        context = new ClassPathXmlApplicationContext("beans-ioc.xml");
    }


    @Test
    public void testExtends() {
        System.out.println(context.getBean("relation1"));
    }

    @Test
    public void testDepends() {
        System.out.println(context.getBean("relation2"));
    }

}