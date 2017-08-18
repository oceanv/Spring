package com.hai.e_iocAnnotation.b_autowired.services.impl;

import com.hai.e_iocAnnotation.b_autowired.dao.inter.CarDao;
import com.hai.e_iocAnnotation.b_autowired.services.inter.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("carService")
public class CarServiceImpl implements CarService {

    @Autowired
    @Qualifier("carDao2")
    private CarDao dao;

    @Override
    public void show() {
        System.out.println(this.getClass().getName());
        dao.show();
    }
}
