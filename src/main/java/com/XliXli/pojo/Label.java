package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 标签表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "label")
public class Label extends Model<Label> {

    /**
     * 标签编号
     */
    @TableId(value = "LB_Id", type = IdType.AUTO)
    private Long lbId;
    /**
     * 标签名称
     */
    @TableField("LB_Name")
    private String lbName;
    /**
     * 所属类型
     */
    @TableField("LB_VTId")
    private Long lbVtid;


    public Long getLbId() {
        return lbId;
    }

    public void setLbId(Long lbId) {
        this.lbId = lbId;
    }

    public String getLbName() {
        return lbName;
    }

    public void setLbName(String lbName) {
        this.lbName = lbName;
    }

    public Long getLbVtid() {
        return lbVtid;
    }

    public void setLbVtid(Long lbVtid) {
        this.lbVtid = lbVtid;
    }

    @Override
    protected Serializable pkVal() {
        return this.lbId;
    }

    @Override
    public String toString() {
        return "Label{" +
        ", lbId=" + lbId +
        ", lbName=" + lbName +
        ", lbVtid=" + lbVtid +
        "}";
    }
}
