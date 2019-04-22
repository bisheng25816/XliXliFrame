package com.XliXli.service.impl;

import com.XliXli.mapper.WatchMapper;
import com.XliXli.pojo.Watch;
import com.XliXli.service.WatchService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 关注表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class WatchServiceImpl extends ServiceImpl<WatchMapper, Watch> implements WatchService {

    @Override
    public int createWatch(Watch watch) {
        return 0;
    }

    @Override
    public int deleteWatch(Long Wat_Id) {
        return 0;
    }

    @Override
    public Watch findById(Long Wat_Id) {
        return null;
    }

    @Override
    public Watch findByUser(Long Wat_UserId, Long Wat_FansId) {
        return null;
    }
}
