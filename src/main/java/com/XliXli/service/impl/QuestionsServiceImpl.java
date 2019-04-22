package com.XliXli.service.impl;

import com.XliXli.mapper.QuestionsMapper;
import com.XliXli.pojo.Questions;
import com.XliXli.service.QuestionsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  题库表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class QuestionsServiceImpl extends ServiceImpl<QuestionsMapper, Questions> implements QuestionsService {

    @Override
    public Questions findById(Long Ques_Id) {
        return null;
    }

    @Override
    public Questions findByName(String Ques_Name) {
        return null;
    }
}
