package com.XliXli.service.impl;

import com.XliXli.mapper.VideoMapper;
import com.XliXli.pojo.Video;
import com.XliXli.service.VideoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 视频表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

    @Override
    public int createVideo(Video video) {
        return 0;
    }

    @Override
    public int deleteVideoById(Long V_Id) {
        return 0;
    }

    @Override
    public int deleteVideoByIdList(List<Long> V_IdList) {
        return 0;
    }

    @Override
    public int updateVideoById(Long V_Id, Video video, Boolean isNull) {
        return 0;
    }

    @Override
    public int updateVideoByIdList(List<Long> V_IdList, Video video, Boolean isNull) {
        return 0;
    }

    @Override
    public Video findById(Long V_Id) {
        return null;
    }

    @Override
    public List<Video> findByIdList(List<Long> V_IdList) {
        return null;
    }

    @Override
    public List<Video> findByName(String V_Name) {
        return null;
    }

    @Override
    public List<Video> findByOriginId(Integer V_OriginType, Integer V_OriginId) {
        return null;
    }
}
