package com.hai.e_iocAnnotation.b_autowired;

import com.hai.e_iocAnnotation.b_autowired.controller.CarController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class AutowiredTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans-annotation.xml");
    }

    @Test
    public void test() throws Exception {
        CarController controller = (CarController) context.getBean("carController");
        controller.execute();
    }
}