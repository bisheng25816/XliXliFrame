package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 收藏夹分类表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "favorites")
public class Favorites extends Model<Favorites> {

    /**
     * 收藏夹编号
     */
    @TableId(value = "Fav_Id", type = IdType.AUTO)
    private Long favId;
    /**
     * 收藏夹主人
     */
    @TableField("Fav_UserId")
    private Long favUserid;
    /**
     * 收藏夹名称
     */
    @TableField("Fav_Name")
    private String favName;


    public Long getFavId() {
        return favId;
    }

    public void setFavId(Long favId) {
        this.favId = favId;
    }

    public Long getFavUserid() {
        return favUserid;
    }

    public void setFavUserid(Long favUserid) {
        this.favUserid = favUserid;
    }

    public String getFavName() {
        return favName;
    }

    public void setFavName(String favName) {
        this.favName = favName;
    }

    @Override
    protected Serializable pkVal() {
        return this.favId;
    }

    @Override
    public String toString() {
        return "Favorites{" +
        ", favId=" + favId +
        ", favUserid=" + favUserid +
        ", favName=" + favName +
        "}";
    }
}
