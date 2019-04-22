package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 动态表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "activity")
public class Activity extends Model<Activity> {

    /**
     * 动态编号
     */
    @TableId(value = "AC_Id", type = IdType.AUTO)
    private Long acId;
    /**
     * 动态内容
     */
    @TableField("AC_Content")
    private String acContent;
    /**
     * 发送者
     */
    @TableField("AC_UserId")
    private Long acUserid;
    /**
     * 动态类型
     */
    @TableField("AC_Type")
    private Long acType;
    /**
     * 转发数
     */
    @TableField("AC_RelaysQuantity")
    private Long acRelaysquantity;
    /**
     * 点赞数
     */
    @TableField("AC_PraiseQuantity")
    private Long acPraisequantity;
    /**
     * 发表时间
     */
    @TableField("AC_CreatTime")
    private Date acCreattime;


    public Long getAcId() {
        return acId;
    }

    public void setAcId(Long acId) {
        this.acId = acId;
    }

    public String getAcContent() {
        return acContent;
    }

    public void setAcContent(String acContent) {
        this.acContent = acContent;
    }

    public Long getAcUserid() {
        return acUserid;
    }

    public void setAcUserid(Long acUserid) {
        this.acUserid = acUserid;
    }

    public Long getAcType() {
        return acType;
    }

    public void setAcType(Long acType) {
        this.acType = acType;
    }

    public Long getAcRelaysquantity() {
        return acRelaysquantity;
    }

    public void setAcRelaysquantity(Long acRelaysquantity) {
        this.acRelaysquantity = acRelaysquantity;
    }

    public Long getAcPraisequantity() {
        return acPraisequantity;
    }

    public void setAcPraisequantity(Long acPraisequantity) {
        this.acPraisequantity = acPraisequantity;
    }

    public Date getAcCreattime() {
        return acCreattime;
    }

    public void setAcCreattime(Date acCreattime) {
        this.acCreattime = acCreattime;
    }

    @Override
    protected Serializable pkVal() {
        return this.acId;
    }

    @Override
    public String toString() {
        return "Activity{" +
        ", acId=" + acId +
        ", acContent=" + acContent +
        ", acUserid=" + acUserid +
        ", acType=" + acType +
        ", acRelaysquantity=" + acRelaysquantity +
        ", acPraisequantity=" + acPraisequantity +
        ", acCreattime=" + acCreattime +
        "}";
    }
}
