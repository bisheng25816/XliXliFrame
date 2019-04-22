package com.XliXli.service;

import com.XliXli.pojo.Favorites;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 收藏夹分类表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface FavoritesService extends IService<Favorites> {
    //添加收藏夹
    public int createFavorites(Favorites favorites);
    //按照Id删除收藏夹
    public int deleteFavorites(Long Fav_Id);
    //按照Id修改收藏夹
    public int updateFavorites(Long Fav_Id);
    //按照Id查询收藏夹
    public Favorites findById(Long Fav_Id);
    //按照收藏夹主人查询收藏夹
    public Favorites findByUserId(Long Fav_UserId);
}
