package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 归属类型表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "origin")
public class OriginType extends Model<OriginType> {

    /**
     * 归属编号
     */
    @TableId(value = "Qri_Id", type = IdType.AUTO)
    private Long qriId;
    /**
     * 归属名
     */
    @TableField("Qri_Name")
    private String qriName;
    /**
     * 归属列表名
     */
    @TableField("Qri_Table")
    private String qriTable;


    public Long getQriId() {
        return qriId;
    }

    public void setQriId(Long qriId) {
        this.qriId = qriId;
    }

    public String getQriName() {
        return qriName;
    }

    public void setQriName(String qriName) {
        this.qriName = qriName;
    }

    public String getQriTable() {
        return qriTable;
    }

    public void setQriTable(String qriTable) {
        this.qriTable = qriTable;
    }

    @Override
    protected Serializable pkVal() {
        return this.qriId;
    }

    @Override
    public String toString() {
        return "Origin{" +
        ", qriId=" + qriId +
        ", qriName=" + qriName +
        ", qriTable=" + qriTable +
        "}";
    }
}
