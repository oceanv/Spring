package com.hai.b_iocXml.e_scope;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    private ApplicationContext context;

    @Before
    public  void init() {
        context = new ClassPathXmlApplicationContext("beans-ioc.xml");
    }


    @Test
    public void testDefault() {
        Scope scope1 = (Scope) context.getBean("scope1");
        Scope scope2 = (Scope) context.getBean("scope1");
        System.out.println(scope1);
        System.out.println(scope2);
        System.out.println(scope1 == scope2);   // 单例模式
    }

    @Test
    public void testPrototype() {
        Scope scope1 = (Scope) context.getBean("scope2");
        Scope scope2 = (Scope) context.getBean("scope2");
        System.out.println(scope1);
        System.out.println(scope2);
        System.out.println(scope1 == scope2);   // 单例模式
    }
}