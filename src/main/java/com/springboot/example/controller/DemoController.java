package com.springboot.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController = @Controller + @ResponseBody 默认直接返回json
@RestController
public class DemoController {
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo() {
        return "hello,SpringBoot!";
    }
}
