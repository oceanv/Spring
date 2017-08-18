package com.hai.e_iocAnnotation.b_autowired.dao.impl;


import com.hai.e_iocAnnotation.b_autowired.dao.inter.CarDao;
import org.springframework.stereotype.Repository;

@Repository(value = "carDao")
public class CarDaoImpl implements CarDao {

    @Override
    public void show() {
        System.out.println(this.getClass().getName());
    }

}
