package com.XliXli.service;

import com.XliXli.pojo.Collect;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 收藏表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface CollectService extends IService<Collect> {
    //添加收藏
    public int createCollect(Collect collect);
    //按照Id删除收藏
    public int deleteCollectById(Long Col_Id);
    //按照Id集合删除收藏
    public int deleteCollectByIdList(List<Long> Col_IdList);
    //按照Id查询收藏
    public List<Collect> findById(Long Col_Id);
    //按照Id集合查询收藏
    public List<Collect> findByIdList(List<Long> Col_IdList);
    //按照收藏夹查询收藏
    public List<Collect> findByFavId(Long Col_FavId);
    //按照用户查询收藏
    public List<Collect> findByUserId(Long Col_UserId);
}
