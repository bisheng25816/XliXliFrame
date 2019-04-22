package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 弹幕字体表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "barragefont")
public class Barragefont extends Model<Barragefont> {

    /**
     * 字体编号
     */
    @TableId(value = "BAF_Id", type = IdType.AUTO)
    private Long bafId;
    /**
     * 字体名称
     */
    @TableField("BAF_Name")
    private String bafName;
    /**
     * 字体值
     */
    @TableField("BAF_Value")
    private String bafValue;


    public Long getBafId() {
        return bafId;
    }

    public void setBafId(Long bafId) {
        this.bafId = bafId;
    }

    public String getBafName() {
        return bafName;
    }

    public void setBafName(String bafName) {
        this.bafName = bafName;
    }

    public String getBafValue() {
        return bafValue;
    }

    public void setBafValue(String bafValue) {
        this.bafValue = bafValue;
    }

    @Override
    protected Serializable pkVal() {
        return this.bafId;
    }

    @Override
    public String toString() {
        return "Barragefont{" +
        ", bafId=" + bafId +
        ", bafName=" + bafName +
        ", bafValue=" + bafValue +
        "}";
    }
}
