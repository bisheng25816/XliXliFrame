package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 视频类别表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "vstype")
public class Vstype extends Model<Vstype> {

    /**
     * 类型编号
     */
    @TableId(value = "VST_Id", type = IdType.AUTO)
    private Long vstId;
    /**
     * 类型名称
     */
    @TableField("VST_Name")
    private String vstName;


    public Long getVstId() {
        return vstId;
    }

    public void setVstId(Long vstId) {
        this.vstId = vstId;
    }

    public String getVstName() {
        return vstName;
    }

    public void setVstName(String vstName) {
        this.vstName = vstName;
    }

    @Override
    protected Serializable pkVal() {
        return this.vstId;
    }

    @Override
    public String toString() {
        return "Vstype{" +
        ", vstId=" + vstId +
        ", vstName=" + vstName +
        "}";
    }
}
