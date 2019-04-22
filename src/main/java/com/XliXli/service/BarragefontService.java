package com.XliXli.service;

import com.XliXli.pojo.Barragefont;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 弹幕字体表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface BarragefontService extends IService<Barragefont> {
    //按照Id查询弹幕字体
    public Barragefont findById(Long BAF_Id);
}
