package com.hai.e_iocAnnotation.c_resource;

import com.hai.e_iocAnnotation.c_resource.controller.HouseController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ResourceTest {

    ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans-annotation.xml");
    }


    @Test
    public void testController() throws Exception{
        HouseController controller = (HouseController) context.getBean("houseController");
        controller.execute();
    }
}