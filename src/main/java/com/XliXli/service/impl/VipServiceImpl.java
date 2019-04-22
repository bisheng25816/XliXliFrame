package com.XliXli.service.impl;

import com.XliXli.mapper.VipMapper;
import com.XliXli.pojo.Vip;
import com.XliXli.service.VipService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员权限表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class VipServiceImpl extends ServiceImpl<VipMapper, Vip> implements VipService {

    @Override
    public Vip findById(Long VIP_Id) {
        return null;
    }
}
