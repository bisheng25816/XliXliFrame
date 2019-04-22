package com.XliXli.service.impl;

import com.XliXli.mapper.BarragefontMapper;
import com.XliXli.pojo.Barragefont;
import com.XliXli.service.BarragefontService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 弹幕字体表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class BarragefontServiceImpl extends ServiceImpl<BarragefontMapper, Barragefont> implements BarragefontService {

    @Override
    public Barragefont findById(Long BAF_Id) {
        return null;
    }
}
