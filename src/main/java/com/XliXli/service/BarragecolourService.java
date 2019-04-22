package com.XliXli.service;

import com.XliXli.pojo.Barragecolour;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 弹幕颜色表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface BarragecolourService extends IService<Barragecolour> {
    //按照Id查询弹幕颜色
    public Barragecolour findById(Long BAC_Id);
}
