package com.XliXli.service.impl;

import com.XliXli.mapper.FavoritesMapper;
import com.XliXli.pojo.Favorites;
import com.XliXli.service.FavoritesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 收藏夹分类表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class FavoritesServiceImpl extends ServiceImpl<FavoritesMapper, Favorites> implements FavoritesService {

    @Override
    public int createFavorites(Favorites favorites) {
        return 0;
    }

    @Override
    public int deleteFavorites(Long Fav_Id) {
        return 0;
    }

    @Override
    public int updateFavorites(Long Fav_Id) {
        return 0;
    }

    @Override
    public Favorites findById(Long Fav_Id) {
        return null;
    }

    @Override
    public Favorites findByUserId(Long Fav_UserId) {
        return null;
    }
}
