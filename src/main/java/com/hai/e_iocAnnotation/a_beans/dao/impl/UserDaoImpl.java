package com.hai.e_iocAnnotation.a_beans.dao.impl;


import com.hai.e_iocAnnotation.a_beans.dao.inter.UserDao;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao")  // 重命名Bean名称
public class UserDaoImpl implements UserDao {

    @Override
    public void showUser() {
        System.out.println("CarDaoImpl 1 -> showUser called...");
    }

}
