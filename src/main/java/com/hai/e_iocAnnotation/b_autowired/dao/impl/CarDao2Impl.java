package com.hai.e_iocAnnotation.b_autowired.dao.impl;


import com.hai.e_iocAnnotation.b_autowired.dao.inter.CarDao;
import org.springframework.stereotype.Repository;

@Repository("carDao2")
public class CarDao2Impl implements CarDao {

    @Override
    public void show() {
        System.out.println(this.getClass().getName());
    }
}
