package com.XliXli.service.impl;

import com.XliXli.mapper.VstypeMapper;
import com.XliXli.pojo.Vstype;
import com.XliXli.service.VstypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 稿件类别表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class VstypeServiceImpl extends ServiceImpl<VstypeMapper, Vstype> implements VstypeService {

    @Override
    public Vstype findById(Long VST_Id) {
        return null;
    }
}
