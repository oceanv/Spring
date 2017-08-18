package com.hai.e_iocAnnotation.a_beans.services.impl;

import com.hai.e_iocAnnotation.a_beans.services.inter.UserService;
import org.springframework.stereotype.Service;

@Service("userService") // 重命名bean的名称，默认赋值给value属性
public class UserServiceImpl implements UserService {

    @Override
    public void showUser() {
        System.out.println("UserServiceImpl -> showUser called...");
    }
}
