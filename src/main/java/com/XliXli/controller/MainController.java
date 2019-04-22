package com.XliXli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//需要拦截的主要操作控制
@Controller
@RequestMapping(value = "/MainCon")
public class MainController {
    //进入用户个人主页
    @RequestMapping(value = "/Others_MemCenter_Home")
    public String Others_MemCenter_Home(){
        return "show/Others_MemCenter_Home";
    }
    //进入用户个人主页的修改页面
    @RequestMapping(value = "/Others_MemCenter_Setting")
    public String Others_MemCenter_Setting(){
        return "handle/Others_MemCenter_Setting";
    }
    //答题页面form表单提交------------------------------------------------参数列表还有问题,待处理
    @RequestMapping(value = "/ExaminationSubmit",method = RequestMethod.POST)
    public String ExaminationSubmit(Model model){
        return "result/ExaminationSubmit";
    }
    //跳转到相应的答题结果页面
    //参数为答题校验结果(success或fail)
    @RequestMapping(value = "/ExaminationResult")
    public String ExaminationResult(@RequestParam(value = "ExaminationResult")String ExaminationResult){

        System.out.println("-------------逻辑代码-------------");

        return "result/Examination的Success或Fail页面";
    }
}
