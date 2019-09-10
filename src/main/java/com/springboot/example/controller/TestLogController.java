package com.springboot.example.controller;

import com.springboot.example.model.Config;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
//@Slf4j
public class TestLogController {

    private final Logger log= LoggerFactory.getLogger(getClass());
//    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TestLogController.class);
    @RequestMapping("/hello")
    public @ResponseBody
    String HelloWorld(){
        for(int i=0;i<10;i++){
            log.debug("debug"+i);
            log.info("info"+i);
            log.warn("warn"+i);
            log.error("error"+i);
        }
        return "Hello World!";
    }

    @RequestMapping("/config")
    public String config(){
        Config config =new Config();
        return config.toString();
    }
}
