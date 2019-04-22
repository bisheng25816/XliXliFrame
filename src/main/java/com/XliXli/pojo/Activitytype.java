package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 动态类型表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "activitytype")
public class Activitytype extends Model<Activitytype> {

    /**
     * 类型编号
     */
    @TableId(value = "AT_Id", type = IdType.AUTO)
    private Long atId;
    /**
     * 类型名称
     */
    @TableField("AT_Name")
    private String atName;


    public Long getAtId() {
        return atId;
    }

    public void setAtId(Long atId) {
        this.atId = atId;
    }

    public String getAtName() {
        return atName;
    }

    public void setAtName(String atName) {
        this.atName = atName;
    }

    @Override
    protected Serializable pkVal() {
        return this.atId;
    }

    @Override
    public String toString() {
        return "Activitytype{" +
        ", atId=" + atId +
        ", atName=" + atName +
        "}";
    }
}
