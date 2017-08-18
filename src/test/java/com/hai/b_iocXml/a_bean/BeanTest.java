package com.hai.b_iocXml.a_bean;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans-ioc.xml");
    }

    @Test
    public void testStaticFactory() {
        System.out.println(context.getBean("entryStaticFactory"));
    }


    @Test
    public void testInstanceFactory() {
        System.out.println(context.getBean("entryInstanceFactory"));
    }

    @Test
    public void testSpringFactoryBean() {
        System.out.println(context.getBean("entryFactoryBean"));
    }

}