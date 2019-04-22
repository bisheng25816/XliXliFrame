package com.XliXli.controller;

import com.XliXli.service.VideoscriptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

//需要拦截的异步请求控制
@RestController
@RequestMapping(value = "/MainAjaxCon")
public class MainAjaxController {
    //用户异步获取关注用户的动态消息
    @RequestMapping(value = "/ReadActivity",method = RequestMethod.POST)
    public String ReadActivity(HttpServletRequest httpServletRequest){

        System.out.println("-------------逻辑代码-------------");

        return "JSON";
    }


}
