package com.XliXli.service.impl;

import com.XliXli.mapper.BarrageMapper;
import com.XliXli.pojo.Barrage;
import com.XliXli.service.BarrageService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  弹幕表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class BarrageServiceImpl extends ServiceImpl<BarrageMapper, Barrage> implements BarrageService {

    @Override
    public int createBarrage(Barrage barrage) {
        return 0;
    }

    @Override
    public int deleteBarrageById(Long BA_Id) {
        return 0;
    }

    @Override
    public int deleteBarrageByIdList(List<Long> BA_IdList) {
        return 0;
    }

    @Override
    public Barrage findById(Long BA_Id) {
        return null;
    }

    @Override
    public List<Barrage> findByIdList(List<Long> BA_IdList) {
        return null;
    }

    @Override
    public List<Barrage> findByVId(Long V_Id) {
        return null;
    }

    @Override
    public List<Barrage> findByPattern(Long PatternId) {
        return null;
    }

    @Override
    public List<Barrage> findByCreatTime(Date CreatTime) {
        return null;
    }

    @Override
    public List<Barrage> findByVideoTime(Long VideoTime) {
        return null;
    }
}
