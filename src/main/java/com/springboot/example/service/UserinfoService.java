package com.springboot.example.service;

import com.springboot.example.model.Userinfo;

import java.util.List;

public interface UserinfoService {
    /**
     * 根据name查询用户列表
     */
    public Userinfo selectByPrimaryKey(String useId);
}
