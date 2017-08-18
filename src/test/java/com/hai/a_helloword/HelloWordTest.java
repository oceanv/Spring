package com.hai.a_helloword;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWordTest {

    @Test
    public void hello() throws Exception {
        /*
        //1. 创建HelloWord的一个对象
        HelloWord hello = new HelloWord();
        //2. 为name 属性赋值
        hello.setName("hello");
        */
        // 使用Spring之后可以将1，2交给Spring来完成

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-ioc.xml");

        HelloWord helloWord = (HelloWord) context.getBean("helloWord");


        //3. 调用hello方法
        helloWord.hello();
    }

}