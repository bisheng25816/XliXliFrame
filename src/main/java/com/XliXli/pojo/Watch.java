package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 关注表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "watch")
public class Watch extends Model<Watch> {

    /**
     * 关注编号
     */
    @TableId(value = "Wat_Id", type = IdType.AUTO)
    private Long watId;
    /**
     * 被关注者
     */
    @TableField("Wat_UserId")
    private Long watUserid;
    /**
     * 关注者
     */
    @TableField("Wat_FansId")
    private Long watFansid;


    public Long getWatId() {
        return watId;
    }

    public void setWatId(Long watId) {
        this.watId = watId;
    }

    public Long getWatUserid() {
        return watUserid;
    }

    public void setWatUserid(Long watUserid) {
        this.watUserid = watUserid;
    }

    public Long getWatFansid() {
        return watFansid;
    }

    public void setWatFansid(Long watFansid) {
        this.watFansid = watFansid;
    }

    @Override
    protected Serializable pkVal() {
        return this.watId;
    }

    @Override
    public String toString() {
        return "Watch{" +
        ", watId=" + watId +
        ", watUserid=" + watUserid +
        ", watFansid=" + watFansid +
        "}";
    }
}
