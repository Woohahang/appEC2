package com.appEC2.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class RestControllerMapping {

    @RequestMapping("restController")
    public String restController () {

        return "restController 메서드 문자열";
    }

}
