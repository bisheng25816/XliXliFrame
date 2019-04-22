package com.XliXli.service;

import com.XliXli.pojo.Activity;
import com.baomidou.mybatisplus.service.IService;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 动态表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface ActivityService extends IService<Activity> {
    //添加动态
    public int createActivity(Activity activity);
    //按照ID删除动态
    public int deleteActivityById(Long AC_Id);
    //按照ID集合删除动态
    public int deleteActivityByIdList(List<Long> AC_IdList);
    /*按照ID修改动态,是否支持对象部分属性为空
     true：对象属性可以只封装一部分，其余空值部分不影响数据库列原有值
     false：将数据库中字段改为null*/
    public int updateActivityById(Long AC_Id,Activity activity,Boolean isNull);
    //按照ID查询动态
    public Activity findById(Long AC_Id);
    //按照ID集合查询动态
    public List<Activity> findByIdList(List<Long> AC_IdList);
    //按照发送者查询动态
    public List<Activity> findByUserId(Long AC_UserId);
    //按照类型查询动态
    public List<Activity> findByType(Long AC_Type);
    //按照发送时间查询动态
    public List<Activity> findByCreatTime(Date AC_CreatTime);
}
