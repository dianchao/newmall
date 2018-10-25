package com.dianchao.newmall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 调度控制器
 */
@Controller
public class DispatcherController {
    @RequestMapping("/login")
    public String login(){
       return "login";
    }
}
