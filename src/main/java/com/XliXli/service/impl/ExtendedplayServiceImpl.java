package com.XliXli.service.impl;

import com.XliXli.mapper.ExtendedplayMapper;
import com.XliXli.pojo.Extendedplay;
import com.XliXli.service.ExtendedplayService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 番剧表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class ExtendedplayServiceImpl extends ServiceImpl<ExtendedplayMapper, Extendedplay> implements ExtendedplayService {

    @Override
    public Extendedplay findById(Long EP_Id) {
        return null;
    }

    @Override
    public List<Extendedplay> findAll(Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Extendedplay> findByName(String EP_Name, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Extendedplay> findByKeyWord(String KeyWord, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Extendedplay> findByIdList(List EP_IdList, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Extendedplay> findByVSType(Long VST_Id, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Extendedplay> findByLBType(Long LB_Id, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Extendedplay> findByRelease(Date Release, Long MaxDuration, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Extendedplay> findByState(Long State, Long MaxDuration, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }
}
