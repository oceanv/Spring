package com.hai.e_iocAnnotation.a_beans.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
