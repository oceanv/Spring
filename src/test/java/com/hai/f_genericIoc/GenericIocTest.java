package com.hai.f_genericIoc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class GenericIocTest {

    ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans-genericIoc.xml");
    }

    @Test
    public void test() throws Exception {
        UserService service = (UserService) context.getBean("userService");
        service.add();
    }

}
