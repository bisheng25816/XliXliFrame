package com.XliXli.service;

import com.XliXli.pojo.Picture;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 图片表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface PictureService extends IService<Picture> {
    //添加图片
    public int createPicture(Picture picture);
    //按照Id删除图片
    public int deletePictureById(Long P_Id);
    //按照Id集合删除图片
    public int deletePictureByIdList(List<Long> P_IdList);
    //按照Id修改图片
    public int updatePictureById(Picture picture);
    //按照Id查询图片
    public Picture findById(Long P_Id);
    //按照Id集合查询图片
    public List<Picture> findByIdList(List<Long> P_IdList);
    //按照图片主人查询图片
    public List<Picture> findByUserId(Long P_UserId);
    //按照所属相册查询图片
    public List<Picture> findByPAId(Long P_PAId);
    //按照所属动态查询图片
    public List<Picture> findByACId(Long P_ACId);
}
