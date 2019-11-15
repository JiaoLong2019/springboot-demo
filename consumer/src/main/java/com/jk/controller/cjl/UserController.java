package com.jk.controller.cjl;

import com.alibaba.dubbo.config.annotation.Reference;

import com.jk.model.cjl.YongHu;
import com.jk.service.cjl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class UserController {


    @Reference(version = "1.0")
    private UserService userService;

    @RequestMapping("queryUser")
    @ResponseBody
    public List<YongHu> queryUser(){
        return userService.queryUser();
    }
}
