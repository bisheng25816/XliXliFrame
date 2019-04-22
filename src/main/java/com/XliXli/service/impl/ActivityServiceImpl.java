package com.XliXli.service.impl;

import com.XliXli.mapper.ActivityMapper;
import com.XliXli.pojo.Activity;
import com.XliXli.service.ActivityService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 动态表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity> implements ActivityService {

    @Override
    public int createActivity(Activity activity) {
        return 0;
    }

    @Override
    public int deleteActivityById(Long AC_Id) {
        return 0;
    }

    @Override
    public int deleteActivityByIdList(List<Long> AC_IdList) {
        return 0;
    }

    @Override
    public int updateActivityById(Long AC_Id, Activity activity, Boolean isNull) {
        return 0;
    }

    @Override
    public Activity findById(Long AC_Id) {
        return null;
    }

    @Override
    public List<Activity> findByIdList(List<Long> AC_IdList) {
        return null;
    }

    @Override
    public List<Activity> findByUserId(Long AC_UserId) {
        return null;
    }

    @Override
    public List<Activity> findByType(Long AC_Type) {
        return null;
    }

    @Override
    public List<Activity> findByCreatTime(Date AC_CreatTime) {
        return null;
    }
}
