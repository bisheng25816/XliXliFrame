package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 收藏表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "collect")
public class Collect extends Model<Collect> {

    /**
     * 收藏编号
     */
    @TableId(value = "Col_Id", type = IdType.AUTO)
    private Long colId;
    /**
     * 收藏者
     */
    @TableField("Col_UserId")
    private Long colUserid;
    /**
     * 收藏稿件
     */
    @TableField("Col_VSId")
    private Long colVsid;
    /**
     * 所属收藏夹
     */
    @TableField("Col_FavId")
    private Long colFavid;


    public Long getColId() {
        return colId;
    }

    public void setColId(Long colId) {
        this.colId = colId;
    }

    public Long getColUserid() {
        return colUserid;
    }

    public void setColUserid(Long colUserid) {
        this.colUserid = colUserid;
    }

    public Long getColVsid() {
        return colVsid;
    }

    public void setColVsid(Long colVsid) {
        this.colVsid = colVsid;
    }

    public Long getColFavid() {
        return colFavid;
    }

    public void setColFavid(Long colFavid) {
        this.colFavid = colFavid;
    }

    @Override
    protected Serializable pkVal() {
        return this.colId;
    }

    @Override
    public String toString() {
        return "Collect{" +
        ", colId=" + colId +
        ", colUserid=" + colUserid +
        ", colVsid=" + colVsid +
        ", colFavid=" + colFavid +
        "}";
    }
}
