package com.XliXli.service.impl;

import com.XliXli.mapper.PhotoalbumMapper;
import com.XliXli.pojo.Photoalbum;
import com.XliXli.service.PhotoalbumService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class PhotoalbumServiceImpl extends ServiceImpl<PhotoalbumMapper, Photoalbum> implements PhotoalbumService {

    @Override
    public int createPhotoalbum(Photoalbum photoalbum) {
        return 0;
    }

    @Override
    public int deletePhotoalbumById(Long PA_Id) {
        return 0;
    }

    @Override
    public int deletePhotoalbumByIdList(List<Long> PA_IdList) {
        return 0;
    }

    @Override
    public int updatePhotoalbumById(Long PA_Id, Photoalbum photoalbum, Boolean isNull) {
        return 0;
    }

    @Override
    public Photoalbum findById(Long PA_Id) {
        return null;
    }

    @Override
    public List<Photoalbum> findByIdList(List<Long> PA_IdList) {
        return null;
    }

    @Override
    public List<Photoalbum> findByUserId(Long PA_UserId) {
        return null;
    }
}
