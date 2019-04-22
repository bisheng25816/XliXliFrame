package com.XliXli.service.impl;

import com.XliXli.mapper.PictureMapper;
import com.XliXli.pojo.Picture;
import com.XliXli.service.PictureService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 图片表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture> implements PictureService {

    @Override
    public int createPicture(Picture picture) {
        return 0;
    }

    @Override
    public int deletePictureById(Long P_Id) {
        return 0;
    }

    @Override
    public int deletePictureByIdList(List<Long> P_IdList) {
        return 0;
    }

    @Override
    public int updatePictureById(Picture picture) {
        return 0;
    }

    @Override
    public Picture findById(Long P_Id) {
        return null;
    }

    @Override
    public List<Picture> findByIdList(List<Long> P_IdList) {
        return null;
    }

    @Override
    public List<Picture> findByUserId(Long P_UserId) {
        return null;
    }

    @Override
    public List<Picture> findByPAId(Long P_PAId) {
        return null;
    }

    @Override
    public List<Picture> findByACId(Long P_ACId) {
        return null;
    }
}
