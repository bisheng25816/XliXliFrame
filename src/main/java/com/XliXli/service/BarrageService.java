package com.XliXli.service;

import com.XliXli.pojo.Barrage;
import com.baomidou.mybatisplus.service.IService;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  弹幕表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface BarrageService extends IService<Barrage> {

    //添加弹幕
    public int createBarrage(Barrage barrage);
    //按照ID删除弹幕
    public int deleteBarrageById(Long BA_Id);
    //按照ID集合删除弹幕
    public int deleteBarrageByIdList(List<Long> BA_IdList);
    //按照ID查弹幕
    public Barrage findById(Long BA_Id);
    //按照ID集合查弹幕
    public List<Barrage> findByIdList(List<Long> BA_IdList);
    //按照归属视频查找弹幕
    public List<Barrage> findByVId(Long V_Id);
    //按照模式查找弹幕
    public List<Barrage> findByPattern(Long PatternId);
    //按照发送时间查找弹幕
    public List<Barrage> findByCreatTime(Date CreatTime);
    //按照视频秒数查找弹幕
    public List<Barrage> findByVideoTime(Long VideoTime);
}
