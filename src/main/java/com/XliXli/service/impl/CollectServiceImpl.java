package com.XliXli.service.impl;

import com.XliXli.mapper.CollectMapper;
import com.XliXli.pojo.Collect;
import com.XliXli.service.CollectService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 收藏表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class CollectServiceImpl extends ServiceImpl<CollectMapper, Collect> implements CollectService {

    @Override
    public int createCollect(Collect collect) {
        return 0;
    }

    @Override
    public int deleteCollectById(Long Col_Id) {
        return 0;
    }

    @Override
    public int deleteCollectByIdList(List<Long> Col_IdList) {
        return 0;
    }

    @Override
    public List<Collect> findById(Long Col_Id) {
        return null;
    }

    @Override
    public List<Collect> findByIdList(List<Long> Col_IdList) {
        return null;
    }

    @Override
    public List<Collect> findByFavId(Long Col_FavId) {
        return null;
    }

    @Override
    public List<Collect> findByUserId(Long Col_UserId) {
        return null;
    }
}
