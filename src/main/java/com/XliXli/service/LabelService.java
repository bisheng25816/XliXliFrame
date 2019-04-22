package com.XliXli.service;

import com.XliXli.pojo.Label;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 标签表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface LabelService extends IService<Label> {
    //添加标签
    public int createLabel(Label label);
    //按照Id删除标签
    public int deleteLabelById(Long LB_Id);
    //按照Id查询标签
    public Label findById(Long LB_Id);
    //按照所属分类查询标签
    public List<Label> findByVTId(Long LB_VTId);
}
