package com.XliXli.service.impl;

import com.XliXli.mapper.LabelMapper;
import com.XliXli.pojo.Label;
import com.XliXli.service.LabelService;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class LabelServiceImpl extends ServiceImpl<LabelMapper, Label> implements LabelService {

    @Override
    public int createLabel(Label label) {
        return 0;
    }

    @Override
    public int deleteLabelById(Long LB_Id) {
        return 0;
    }

    @Override
    public Label findById(Long LB_Id) {
        return null;
    }

    @Override
    public List<Label> findByVTId(Long LB_VTId) {
        return null;
    }

    @Override
    public boolean insert(Label label) {
        return false;
    }

    @Override
    public boolean insertAllColumn(Label label) {
        return false;
    }

    @Override
    public boolean insertBatch(List<Label> list) {
        return false;
    }

    @Override
    public boolean insertBatch(List<Label> list, int i) {
        return false;
    }

    @Override
    public boolean insertOrUpdateBatch(List<Label> list) {
        return false;
    }

    @Override
    public boolean insertOrUpdateBatch(List<Label> list, int i) {
        return false;
    }

    @Override
    public boolean insertOrUpdateAllColumnBatch(List<Label> list) {
        return false;
    }

    @Override
    public boolean insertOrUpdateAllColumnBatch(List<Label> list, int i) {
        return false;
    }

    @Override
    public boolean delete(Wrapper<Label> wrapper) {
        return false;
    }

    @Override
    public boolean updateById(Label label) {
        return false;
    }

    @Override
    public boolean updateAllColumnById(Label label) {
        return false;
    }

    @Override
    public boolean update(Label label, Wrapper<Label> wrapper) {
        return false;
    }

    @Override
    public boolean updateForSet(String s, Wrapper<Label> wrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(List<Label> list) {
        return false;
    }

    @Override
    public boolean updateBatchById(List<Label> list, int i) {
        return false;
    }

    @Override
    public boolean updateAllColumnBatchById(List<Label> list) {
        return false;
    }

    @Override
    public boolean updateAllColumnBatchById(List<Label> list, int i) {
        return false;
    }

    @Override
    public boolean insertOrUpdate(Label label) {
        return false;
    }

    @Override
    public boolean insertOrUpdateAllColumn(Label label) {
        return false;
    }

    @Override
    public Label selectOne(Wrapper<Label> wrapper) {
        return null;
    }

    @Override
    public Map<String, Object> selectMap(Wrapper<Label> wrapper) {
        return null;
    }

    @Override
    public Object selectObj(Wrapper<Label> wrapper) {
        return null;
    }

    @Override
    public int selectCount(Wrapper<Label> wrapper) {
        return 0;
    }

    @Override
    public List<Label> selectList(Wrapper<Label> wrapper) {
        return null;
    }

    @Override
    public Page<Label> selectPage(Page<Label> page) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<Label> wrapper) {
        return null;
    }

    @Override
    public List<Object> selectObjs(Wrapper<Label> wrapper) {
        return null;
    }

    @Override
    public Page<Map<String, Object>> selectMapsPage(Page page, Wrapper<Label> wrapper) {
        return null;
    }

    @Override
    public Page<Label> selectPage(Page<Label> page, Wrapper<Label> wrapper) {
        return null;
    }
}
