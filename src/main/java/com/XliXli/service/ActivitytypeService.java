package com.XliXli.service;

import com.XliXli.pojo.Activitytype;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  动态类型表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface ActivitytypeService extends IService<Activitytype> {
    //根据Id查询动态类型
    public Activitytype findById(Long AT_Id);
}
