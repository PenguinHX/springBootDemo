package com.springboot.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(value="com.springboot.example.controller")
@ComponentScan(value="com.springboot.example.service")
@ComponentScan(value="com.springboot.example.mapper")
@MapperScan(basePackages = "com.springboot.example.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
