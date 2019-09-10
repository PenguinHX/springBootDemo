package com.springboot.example.controller;

import com.springboot.example.model.Userinfo;
import com.springboot.example.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
public class UserinfoController {

    @Autowired
    private UserinfoService userinfoService;

    @RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
    public String findUserByName(Model model,Userinfo userinfo) {
        Userinfo userList = userinfoService.selectByPrimaryKey("1");
        model.addAttribute("userList",userList);
        return userList.toString();
    }
}
