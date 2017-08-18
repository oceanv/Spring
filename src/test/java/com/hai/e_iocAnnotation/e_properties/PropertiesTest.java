package com.hai.e_iocAnnotation.e_properties;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class PropertiesTest {
    private ApplicationContext context;

    @Before
    public  void init() {
        context = new ClassPathXmlApplicationContext("beans-properties.xml");
    }


    @Test
    public void testConnect() throws SQLException {
        DataSource dataSource = (DataSource)context.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }


    @Test
    public void testProperties() throws SQLException {
        DataSource dataSource = (DataSource)context.getBean("dataSource1");
        System.out.println(dataSource.getConnection());
    }
}
