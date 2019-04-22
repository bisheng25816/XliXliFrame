package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 弹幕模式表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "barragepattern")
public class Barragepattern extends Model<Barragepattern> {

    /**
     * 模式编号
     */
    @TableId(value = "BAP_Id", type = IdType.AUTO)
    private Long bapId;
    /**
     * 模式名称
     */
    @TableField("BAP_Name")
    private String bapName;


    public Long getBapId() {
        return bapId;
    }

    public void setBapId(Long bapId) {
        this.bapId = bapId;
    }

    public String getBapName() {
        return bapName;
    }

    public void setBapName(String bapName) {
        this.bapName = bapName;
    }

    @Override
    protected Serializable pkVal() {
        return this.bapId;
    }

    @Override
    public String toString() {
        return "Barragepattern{" +
        ", bapId=" + bapId +
        ", bapName=" + bapName +
        "}";
    }
}
