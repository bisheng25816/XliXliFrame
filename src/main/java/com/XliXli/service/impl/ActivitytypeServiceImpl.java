package com.XliXli.service.impl;

import com.XliXli.mapper.ActivitytypeMapper;
import com.XliXli.pojo.Activitytype;
import com.XliXli.service.ActivitytypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  动态类型表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class ActivitytypeServiceImpl extends ServiceImpl<ActivitytypeMapper, Activitytype> implements ActivitytypeService {

    @Override
    public Activitytype findById(Long AT_Id) {
        return null;
    }
}
