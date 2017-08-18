package com.hai.e_iocAnnotation.a_beans.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public void execute() {
        System.out.println("UserController -> execute ...");
    }
}
