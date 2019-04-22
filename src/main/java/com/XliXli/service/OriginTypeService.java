package com.XliXli.service;

import com.XliXli.pojo.OriginType;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  归属表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface OriginTypeService extends IService<OriginType> {
    //查询全部归属
    public List<OriginType> findAll();
    //按照Id查询归属
    public OriginType findById(Long Qri_Id);
    //按照名字查询归属
    public OriginType findByName(String Qri_Name);
}
