package com.XliXli.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//不需要拦截的异步请求控制
@RestController()
@RequestMapping("/AjaxCon")
public class AjaxController {
    //用户注册异步验证昵称是否已存在
    @RequestMapping(value = "/RegisterCheckName",method = RequestMethod.POST)
    public Object RegisterCheckName(@RequestParam(value = "Mem_Name")String Mem_Name){

        System.out.println("-------------逻辑代码-------------");

        return "true or false";
    }
    //用户注册异步验证手机或邮箱是否已存在
    /*参数1：用户验证的是手机还是邮箱(1:手机,2:邮箱)
     参数2：手机或邮箱的值*/
    @RequestMapping(value = "/RegisterCheckBind",method = RequestMethod.POST)
    public Object RegisterCheckBind(@RequestParam(value = "Mem_bindType")Integer Mem_bindType,
                              @RequestParam(value = "Mem_bindValue")String Mem_bindValue){

        System.out.println("-------------逻辑代码-------------");

        return "true or false";
    }
    //首页异步获取视频信息
    /*参数1：用户选择的分类按钮值
      参数2：用户选择的排序按钮值(如，1：按投稿时间，2：按视频热度，3：XXX)*/
    @RequestMapping(value = "/GetVideoList")
    public Object GetVideoList(@RequestParam(value = "VST_Id",required = false) Long VST_Id,
                               @RequestParam(value = "Order",required = false) Integer Order){

        System.out.println("-------------逻辑代码-------------");

        return "Json";
    }
    //播放页异步加载视频-----------------------------------参数待定
    @RequestMapping(value = "/LoadVideo",method = RequestMethod.POST)
    public Object LoadVideo(){

        System.out.println("-------------逻辑代码-------------");

        return "Json";
    }
}
