package com.XliXli.service;

import com.XliXli.pojo.Photoalbum;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 相册表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface PhotoalbumService extends IService<Photoalbum> {
    //添加相册
    public int createPhotoalbum(Photoalbum photoalbum);
    //按照Id删除相册
    public int deletePhotoalbumById(Long PA_Id);
    //按照Id集合删除相册
    public int deletePhotoalbumByIdList(List<Long> PA_IdList);
    /*按照ID修改相册,是否支持对象部分属性为空
     true：对象属性可以只封装一部分，其余空值部分不影响数据库列原有值
     false：将数据库中字段改为null*/
    public int updatePhotoalbumById(Long PA_Id,Photoalbum photoalbum,Boolean isNull);
    //按照Id查询相册
    public Photoalbum findById(Long PA_Id);
    //按照Id集合查询相册
    public List<Photoalbum> findByIdList(List<Long> PA_IdList);
    //按照相册主人查询相册
    public List<Photoalbum> findByUserId(Long PA_UserId);

}
