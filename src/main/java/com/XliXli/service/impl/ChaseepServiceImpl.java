package com.XliXli.service.impl;

import com.XliXli.mapper.ChaseepMapper;
import com.XliXli.pojo.Chaseep;
import com.XliXli.service.ChaseepService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 追番表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class ChaseepServiceImpl extends ServiceImpl<ChaseepMapper, Chaseep> implements ChaseepService {

    @Override
    public int createChaseep(Chaseep chaseep) {
        return 0;
    }

    @Override
    public Chaseep deleteChaseep(Long CEP_Id) {
        return null;
    }

    @Override
    public Chaseep findById(Long CEP_Id) {
        return null;
    }

    @Override
    public Chaseep findByIdList(List<Long> CEP_IdList) {
        return null;
    }

    @Override
    public List<Chaseep> findByUserId(Long CEP_UserId) {
        return null;
    }

    @Override
    public List<Chaseep> findByEPId(Long CEP_EPId) {
        return null;
    }
}
