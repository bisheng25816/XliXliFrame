package com.XliXli.service.impl;

import com.XliXli.mapper.OriginTypeMapper;
import com.XliXli.pojo.OriginType;
import com.XliXli.service.OriginTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  归属表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class OriginTypeServiceImpl extends ServiceImpl<OriginTypeMapper, OriginType> implements OriginTypeService {

    @Override
    public List<OriginType> findAll() {
        return null;
    }

    @Override
    public OriginType findById(Long Qri_Id) {
        return null;
    }

    @Override
    public OriginType findByName(String Qri_Name) {
        return null;
    }
}
