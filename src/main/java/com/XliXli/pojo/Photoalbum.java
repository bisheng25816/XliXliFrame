package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 相册表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "photoalbum")
public class Photoalbum extends Model<Photoalbum> {

    /**
     * 相册编号
     */
    @TableId(value = "PA_Id", type = IdType.AUTO)
    private Long paId;
    /**
     * 相册主人
     */
    @TableField("PA_UserId")
    private Long paUserid;
    /**
     * 相册名
     */
    @TableField("PA_Name")
    private String paName;


    public Long getPaId() {
        return paId;
    }

    public void setPaId(Long paId) {
        this.paId = paId;
    }

    public Long getPaUserid() {
        return paUserid;
    }

    public void setPaUserid(Long paUserid) {
        this.paUserid = paUserid;
    }

    public String getPaName() {
        return paName;
    }

    public void setPaName(String paName) {
        this.paName = paName;
    }

    @Override
    protected Serializable pkVal() {
        return this.paId;
    }

    @Override
    public String toString() {
        return "Photoalbum{" +
        ", paId=" + paId +
        ", paUserid=" + paUserid +
        ", paName=" + paName +
        "}";
    }
}
