package com.springboot.example.service.impl;

import com.springboot.example.mapper.UserinfoMapper;
import com.springboot.example.model.Userinfo;
import com.springboot.example.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public Userinfo selectByPrimaryKey(String useId) {
        return userinfoMapper.selectByPrimaryKey(useId);
    }
}
