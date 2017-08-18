package com.hai.e_iocAnnotation.c_resource.services.impl;

import com.hai.e_iocAnnotation.c_resource.dao.inter.HouseDao;
import com.hai.e_iocAnnotation.c_resource.services.inter.HouseService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("houseService")
public class HouseServiceImpl implements HouseService {

    @Resource(name = "houseDao")
    private HouseDao dao;

    @Override
    public void show() {
        System.out.println(this.getClass().getName());
        dao.show();
    }
}
