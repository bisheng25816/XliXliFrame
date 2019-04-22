package com.XliXli.service.impl;

import com.XliXli.mapper.BarragepatternMapper;
import com.XliXli.pojo.Barragepattern;
import com.XliXli.service.BarragepatternService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 弹幕模式表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class BarragepatternServiceImpl extends ServiceImpl<BarragepatternMapper, Barragepattern> implements BarragepatternService {

    @Override
    public Barragepattern findById(Long BAP_Id) {
        return null;
    }
}
