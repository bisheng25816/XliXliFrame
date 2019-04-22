package com.XliXli.service;

import com.XliXli.pojo.Questions;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  题库表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface QuestionsService extends IService<Questions> {
    //按照Id查询题目
    public Questions findById(Long Ques_Id);
    //按照内容查找题目
    public Questions findByName(String Ques_Name);
}
