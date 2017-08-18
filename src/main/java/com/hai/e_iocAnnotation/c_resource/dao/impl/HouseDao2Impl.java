package com.hai.e_iocAnnotation.c_resource.dao.impl;


import com.hai.e_iocAnnotation.c_resource.dao.inter.HouseDao;
import org.springframework.stereotype.Repository;

@Repository("houseDao2")
public class HouseDao2Impl implements HouseDao {

    @Override
    public void show() {
        System.out.println(this.getClass().getName());
    }
}
