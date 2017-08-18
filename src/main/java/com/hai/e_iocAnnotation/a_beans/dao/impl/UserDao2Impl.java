package com.hai.e_iocAnnotation.a_beans.dao.impl;


import com.hai.e_iocAnnotation.a_beans.dao.inter.UserDao;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao2")  // 重命名Bean名称
public class UserDao2Impl implements UserDao {

    @Override
    public void showUser() {
        System.out.println("CarDaoImpl 2 -> showUser called...");
    }
}
