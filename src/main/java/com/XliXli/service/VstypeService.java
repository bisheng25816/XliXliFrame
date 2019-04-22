package com.XliXli.service;

import com.XliXli.pojo.Vstype;
import com.baomidou.mybatisplus.service.IService;


/**
 * <p>
 * 视频类别表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface VstypeService extends IService<Vstype> {
    //按照Id查询视频类别
    public Vstype findById(Long VST_Id);
}
