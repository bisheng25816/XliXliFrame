package com.XliXli.service;

import com.XliXli.pojo.Barragepattern;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 弹幕模式表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface BarragepatternService extends IService<Barragepattern> {
    //按照Id查询弹幕模式
    public Barragepattern findById(Long BAP_Id);
}
