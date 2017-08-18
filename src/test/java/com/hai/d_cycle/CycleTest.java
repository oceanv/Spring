package com.hai.d_cycle;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CycleTest {
    private ClassPathXmlApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans-cycle.xml");
    }

    @Test
    public void testCycle() throws Exception {
        Cycle cycle = (Cycle) context.getBean("cycle");
        System.out.println(cycle);

        context.close();
    }
}