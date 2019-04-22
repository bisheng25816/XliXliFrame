package com.XliXli.service.impl;

import com.XliXli.mapper.BarragecolourMapper;
import com.XliXli.pojo.Barragecolour;
import com.XliXli.service.BarragecolourService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 弹幕颜色表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class BarragecolourServiceImpl extends ServiceImpl<BarragecolourMapper, Barragecolour> implements BarragecolourService {

    @Override
    public Barragecolour findById(Long BAC_Id) {
        return null;
    }
}
