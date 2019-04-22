package com.XliXli.service;

import com.XliXli.pojo.Video;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 视频表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface VideoService extends IService<Video> {
    //添加视频
    public int createVideo(Video video);
    //按照ID删除稿件
    public int deleteVideoById(Long V_Id);
    //按ID集合删除稿件
    public int deleteVideoByIdList(List<Long> V_IdList);
    /*按照ID修改视频,是否支持对象部分属性为空
     true：对象属性可以只封装一部分，其余空值部分不影响数据库列原有值
     false：将数据库中字段改为null*/
    public int updateVideoById(Long V_Id,Video video,Boolean isNull);
    /*按照ID集合修改视频,是否支持对象部分属性为空
     true：对象属性可以只封装一部分，其余空值部分不影响数据库列原有值
     false：将数据库中字段改为null*/
    public int updateVideoByIdList(List<Long> V_IdList,Video video,Boolean isNull);
    //按照ID查询视频
    public Video findById(Long V_Id);
    //按ID集合查询视频
    public List<Video> findByIdList(List<Long> V_IdList);
    //按照名称查找视频
    public List<Video> findByName(String V_Name);
    //按照归属ID找视频
    public List<Video> findByOriginId(Integer V_OriginType,Integer V_OriginId);
}
