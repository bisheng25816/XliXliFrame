package com.XliXli.service;

import com.XliXli.pojo.Vip;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 会员权限表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface VipService extends IService<Vip> {
    //按照Id查询会员权限
    public Vip findById(Long VIP_Id);
}
