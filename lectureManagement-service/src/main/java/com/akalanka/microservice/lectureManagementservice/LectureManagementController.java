package com.akalanka.microservice.lectureManagementservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LectureManagementController {

    @Autowired
    private Configuration configuration;

    @GetMapping(value = "/lecture")
    public Lecture lectureConfig(){
        return new Lecture(configuration.getMaximum(),configuration.getMinimum());
    }

}
