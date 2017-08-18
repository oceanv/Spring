package com.hai.e_iocAnnotation.a_beans;

import com.hai.e_iocAnnotation.a_beans.controller.UserController;
import com.hai.e_iocAnnotation.a_beans.dao.inter.UserDao;
import com.hai.e_iocAnnotation.a_beans.model.User;
import com.hai.e_iocAnnotation.a_beans.services.inter.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans-annotation.xml");
    }

    @Test
    public void testComponent() throws Exception {
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testDao() throws Exception{
        UserDao userDao = (UserDao)context.getBean("userDao");
        userDao.showUser();
    }

    @Test
    public void testServices() throws Exception{
        UserService userService = (UserService)context.getBean("userService");
        userService.showUser();
    }

    @Test
    public void testController() throws Exception{
        UserController userController = (UserController)context.getBean("userController");
        userController.execute();
    }
}