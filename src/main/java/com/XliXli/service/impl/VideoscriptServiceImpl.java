package com.XliXli.service.impl;

import com.XliXli.mapper.VideoscriptMapper;
import com.XliXli.pojo.Videoscript;
import com.XliXli.service.VideoscriptService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 视频稿件表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class VideoscriptServiceImpl extends ServiceImpl<VideoscriptMapper, Videoscript> implements VideoscriptService {

    @Override
    public int createVideoscript(Videoscript videoscript) {
        return 0;
    }

    @Override
    public int logicDeleteVideoscriptById(Long VS_Id) {
        return 0;
    }

    @Override
    public int deleteVideoscriptById(Long VS_Id) {
        return 0;
    }

    @Override
    public int logicDeleteVideoscriptByIdList(List<Long> VS_IdList) {
        return 0;
    }

    @Override
    public int deleteVideoscriptByIdList(List<Long> VS_IdList) {
        return 0;
    }

    @Override
    public int updateVideoscriptById(Long VS_Id, Videoscript videoscript, Boolean isNull) {
        return 0;
    }

    @Override
    public int updateVideoscriptByIdList(List<Long> VS_IdList, Videoscript videoscript, Boolean isNull) {
        return 0;
    }

    @Override
    public Videoscript findById(Long VS_Id, Boolean boo, Integer index, Integer size) {
        return null;
    }

    @Override
    public List<Videoscript> findAll(Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Videoscript> findByName(String VS_Name, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Videoscript> findByKeyWord(String KeyWord, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Videoscript> findByIdList(List<Long> VS_IdList, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Videoscript> findByVSType(Long VST_Id, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Videoscript> findByLBType(Long LB_Id, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Videoscript> findByDuration(Long MinDuration, Long MaxDuration, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }

    @Override
    public List<Videoscript> findByRelease(Date UploadTime, Long MaxDuration, Boolean boo, Integer index, Integer size, String column, Integer rule) {
        return null;
    }
}
