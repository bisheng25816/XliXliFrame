package com.XliXli.service.impl;

import com.XliXli.mapper.EstimateMapper;
import com.XliXli.pojo.Estimate;
import com.XliXli.service.EstimateService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class EstimateServiceImpl extends ServiceImpl<EstimateMapper, Estimate> implements EstimateService {

    @Override
    public int createEstimate(Estimate estimate) {
        return 0;
    }

    @Override
    public int deleteEstimateById(Long ES_Id) {
        return 0;
    }

    @Override
    public int updateEstimateById(Long ES_Id, Estimate estimate) {
        return 0;
    }

    @Override
    public Estimate findById(Long ES_Id) {
        return null;
    }

    @Override
    public List<Estimate> findByOrigin(Long ES_OriginType, Long ES_OriginId, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Estimate> findByUserId(Long ES_UserId) {
        return null;
    }

    @Override
    public List<Estimate> findByReplyId(Long ES_ReplyId) {
        return null;
    }

    @Override
    public List<Estimate> findByCreatTime(Long ES_CreatTime) {
        return null;
    }
}
