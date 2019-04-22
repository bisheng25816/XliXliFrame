package com.XliXli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//不需要拦截的用户表单提交相关操作控制
@Controller
@RequestMapping(value = "/Member")
public class MemberController {
    //用户注册提交
    /*参数1：用户昵称
      参数2：用户密码
      参数3：用户注册绑定手机还是邮箱(1:手机,2:邮箱)
      参数4：手机或邮箱的值*/
    @RequestMapping(value = "/DoRegister/{Mem_name}/{Mem_pwd}/{Mem_bindType}/{Mem_bindValue}",method = RequestMethod.POST)
    public String MemDoRegister(@PathVariable(value = "Mem_name") String Mem_Name,
                              @PathVariable(value = "Mem_pwd") String Mem_pwd,
                              @PathVariable(value = "Mem_bindType") Integer Mem_bindType,
                              @PathVariable(value = "Mem_bindValue") String Mem_bindValue){

        System.out.println("-------------逻辑代码-------------");

        return "redirect:result/RegisterSuccess";
    }
    //用户登录提交
    /*参数1：用户使用手机号还是邮箱登录(1:手机,2:邮箱)
      参数2：手机或邮箱的值
      参数3：用户密码*/
    @RequestMapping(value = "/DoLogin/{Mem_bindType}/{Mem_bindValue}/{Mem_pwd}",method = RequestMethod.POST)
    public String MemDoLogin(Model model,
                              @PathVariable(value = "Mem_bindType") Integer Mem_bindType,
                              @PathVariable(value = "Mem_bindValue") String Mem_bindValue,
                              @PathVariable(value = "Mem_pwd") Integer Mem_pwd){

        System.out.println("-------------逻辑代码-------------");

        return "成功则跳转回点击登录时的页面(如：用户看视频时登录，成功后要重定向回视频页)";
    }
}
