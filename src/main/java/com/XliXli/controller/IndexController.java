package com.XliXli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//不需要拦截的显示和跳转操作控制
@Controller
@RequestMapping("/")
public class IndexController {
    //网站首页
    @RequestMapping(value = "/")
    public String XliIndex(Model model){

        System.out.println("-------------逻辑代码-------------");

        return "show/HomePage";
    }
    //按钮形式搜索视频，显示形式为列表1的跳转
    /*参数1：用户选择的分类按钮值
      参数2：用户选择的标签按钮值
      参数3：用户选择的排序按钮值(如，1：按投稿时间，2：按视频热度，3：XXX)*/
    @RequestMapping(value = "/VSIndexByType")
    public String VSIndexByType(Model model,
                              @RequestParam(value = "VST_Id",required = false) Long VST_Id,
                              @RequestParam(value = "LBT_Id",required = false) Long LBT_Id,
                              @RequestParam(value = "Order",required = false) Integer Order){

        System.out.println("-------------逻辑代码-------------");

        return "show/ShowListPage01";
    }
    //输入条件搜索视频，可选按钮增加条件，显示形式为列表2的跳转
    /*参数1：用户输入的关键字
      参数2：用户选择的排序规则按钮(如，1：最多弹幕:，2：最新发布，3：最多点击:，4：最多收藏)
      参数3：用户选择的时长条件按钮(如，1：10分钟以下，2：10-20分钟:，3：60分钟以上，4：XXX)
      参数4：用户选择的类型按钮(如：鬼畜、科技、游戏、娱乐)*/
    @RequestMapping(value = "/VSIndexByMany")
    public String VSIndexByMany(Model model,
                                 @RequestParam(value = "KeyWord",required = false) String KeyWord,
                                 @RequestParam(value = "Order",required = false) Integer Order,
                                 @RequestParam(value = "Duration",required = false) Integer Duration,
                                 @RequestParam(value = "VST_Id",required = false) Long VST_Id){

        System.out.println("-------------逻辑代码-------------");

        return "show/ShowListPage02";
    }
    //跳转到用户注册页面
    @RequestMapping(value = "/Register")
    public String Register(){
        return "handle/MemRegister";
    }
    //跳转到用户登录页面
    @RequestMapping(value = "/Login")
    public String Login(){
        return "handle/MemLogin";
    }
    //跳转到访问其他用户主页
    //参数为访问用户主页的哪个专栏，如：动态、投稿、收藏
    @RequestMapping(value = "/Others_MemCenter")
    public String Others_MemCenter(Model model,
                                        @RequestParam(value = "TableName",required = false)String TableName){

        System.out.println("-------------逻辑代码-------------");

        return "show/Others_MemCenter_XXXXX";
    }
    //跳转到视频播放页面
    /*参数1：用户选择的是番剧还是稿件
      参数2：稿件或番剧集的ID
      参数3：该视频集下的具体视频ID*/
    @RequestMapping(value = "/VideoPlay")
    public String VideoPlay(Model model,
                            @RequestParam(value = "VideoType")String VideoType,
                            @RequestParam(value = "VideoListId")String VideoListId,
                            @RequestParam(value = "VideoId")String VideoId){

        System.out.println("-------------逻辑代码-------------");

        return "show/VideoPlay";
    }

}
