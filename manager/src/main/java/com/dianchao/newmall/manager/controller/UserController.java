package com.dianchao.newmall.manager.controller;

import com.dianchao.newmall.common.bean.User;
import com.dianchao.newmall.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public String doLogin(User user, Map map){
        //获取表单提交的数据
        //1) req.getParameter("username");
        //2) 参数列表中直接增加同名参数
        //3) 将参数封装为实体类对象（表单数据的名称=实体类中属性名称）

        //查询用户信息(账号、密码)
        //返回查询的结果
        System.out.println("入参：" + user);
        User dbUser = userService.queryLoginUser(user);
        System.out.println(dbUser);
        //对返回结果进行判断
        //如果用户存在的场合，跳转到主页面
        //如果用户不存在，那么跳转到登陆页面，并提示错误信息
        if(null != dbUser){
            return "main";
        }else{
            String errMsg = "登录账户或密码不正确，请重新登录!";
            map.put("error", errMsg);
            return "redirect:/login";
        }
    }
}
