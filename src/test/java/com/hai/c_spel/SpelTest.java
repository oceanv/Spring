package com.hai.c_spel;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans-spel.xml");
    }

    @Test
    public void testLiteral() throws Exception {
        System.out.println(context.getBean("spelLiteral"));
    }

    @Test
    public void testRelation() throws Exception {
        System.out.println(context.getBean("spelRelation"));
    }


    @Test
    public void testOperator() throws Exception {
        System.out.println(context.getBean("spelOperator"));
    }



}