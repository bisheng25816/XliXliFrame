package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 弹幕颜色表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "barragecolour")
public class Barragecolour extends Model<Barragecolour> {

    /**
     * 颜色编号
     */
    @TableId(value = "BAC_Id", type = IdType.AUTO)
    private Long bacId;
    /**
     * 颜色名称
     */
    @TableField("BAC_Name")
    private String bacName;
    /**
     * 颜色值
     */
    @TableField("BAC_Value")
    private String bacValue;


    public Long getBacId() {
        return bacId;
    }

    public void setBacId(Long bacId) {
        this.bacId = bacId;
    }

    public String getBacName() {
        return bacName;
    }

    public void setBacName(String bacName) {
        this.bacName = bacName;
    }

    public String getBacValue() {
        return bacValue;
    }

    public void setBacValue(String bacValue) {
        this.bacValue = bacValue;
    }

    @Override
    protected Serializable pkVal() {
        return this.bacId;
    }

    @Override
    public String toString() {
        return "Barragecolour{" +
        ", bacId=" + bacId +
        ", bacName=" + bacName +
        ", bacValue=" + bacValue +
        "}";
    }
}
