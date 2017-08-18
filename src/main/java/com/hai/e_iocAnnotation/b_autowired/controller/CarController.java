package com.hai.e_iocAnnotation.b_autowired.controller;

import com.hai.e_iocAnnotation.b_autowired.services.inter.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CarController {

    @Autowired
    private CarService service;

    public void execute() {
        System.out.println(this.getClass().getName());
        service.show();
    }

}
