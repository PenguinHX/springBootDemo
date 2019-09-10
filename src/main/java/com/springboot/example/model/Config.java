package com.springboot.example.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@ConfigurationProperties(prefix="config")
//引入配置文件 @PropertySources 引入多个配置文件
@PropertySource(value= {"classpath:my.properties"}, encoding="utf-8")
@Data
public class Config {
    String code;
    String name;

    List<String> hobby;
}
