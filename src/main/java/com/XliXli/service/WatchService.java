package com.XliXli.service;

import com.XliXli.pojo.Watch;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 关注表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface WatchService extends IService<Watch> {
    //添加关注
    public int createWatch(Watch watch);
    //按照Id删除关注
    public int deleteWatch(Long Wat_Id);
    //按照Id查询关注
    public Watch findById(Long Wat_Id);
    //按照用户关系查询关注
    public Watch findByUser(Long Wat_UserId,Long Wat_FansId);
}
