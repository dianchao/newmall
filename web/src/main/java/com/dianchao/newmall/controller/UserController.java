package com.dianchao.newmall.controller;

import com.dianchao.newmall.bean.User;
import com.dianchao.newmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        System.out.println(userService);
        return "user/index";
    }

    //Object ==> json
    @ResponseBody
    @RequestMapping("/json")
    public Object json() {
        //Map map = new HashMap();
        //map.put("username", "张三");
        List<User> users = userService.queryAll();
        return users;
    }
}
