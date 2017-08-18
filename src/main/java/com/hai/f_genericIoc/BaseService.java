package com.hai.f_genericIoc;

import javax.annotation.Resource;

public class BaseService<T> {

    @Resource   // 该内容会被子类继承
    protected BaseRepository<T> repository;

    public void add() {
        System.out.println(this.getClass().getName());

        // 在这里使用的是子类实现的Bean 为(4.x新特性)
        System.out.println(repository.getClass().getName());    // com.hai.f_genericIoc.UserRepository
    }
}
