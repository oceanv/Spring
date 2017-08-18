package com.hai.e_iocAnnotation.c_resource.controller;

import com.hai.e_iocAnnotation.c_resource.services.inter.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Controller
public class HouseController {

    @Resource
    private HouseService service;

    public void execute() {
        System.out.println(this.getClass().getName());
        service.show();
    }

}
