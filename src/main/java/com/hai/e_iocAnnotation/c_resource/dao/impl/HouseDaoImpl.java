package com.hai.e_iocAnnotation.c_resource.dao.impl;


import com.hai.e_iocAnnotation.c_resource.dao.inter.HouseDao;
import org.springframework.stereotype.Repository;

@Repository(value = "houseDao")
public class HouseDaoImpl implements HouseDao {

    @Override
    public void show() {
        System.out.println(this.getClass().getName());
    }

}
