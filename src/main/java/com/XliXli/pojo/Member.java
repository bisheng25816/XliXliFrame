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
 * 用户表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "member")
public class Member extends Model<Member> {

    /**
     * 用户编号
     */
    @TableId(value = "Mem_Id", type = IdType.AUTO)
    private Long memId;
    /**
     * 昵称
     */
    @TableField("Mem_Name")
    private String memName;
    /**
     * 密码
     */
    @TableField("Mem_Password")
    private String memPassword;
    /**
     * 手机
     */
    @TableField("Mem_Telephone")
    private String memTelephone;
    /**
     * 邮箱
     */
    @TableField("Mem_Email")
    private String memEmail;
    /**
     * 关注数
     */
    @TableField("Mem_WatchQuantity")
    private Long memWatchquantity;
    /**
     * 粉丝数
     */
    @TableField("Mem_FansQuantity")
    private Long memFansquantity;
    /**
     * 头像
     */
    @TableField("Mem_Portrait")
    private String memPortrait;
    /**
     * 签名
     */
    @TableField("Mem_Autograph")
    private String memAutograph;
    /**
     * 硬币数
     */
    @TableField("Mem_CoinQuantity")
    private Long memCoinquantity;
    /**
     * 等级
     */
    @TableField("Mem_Level")
    private Integer memLevel;
    /**
     * 注册时间
     */
    @TableField("Mem_RegisterTime")
    private Date memRegistertime;
    /**
     * 性别
     */
    @TableField("Mem_Sex")
    private String memSex;
    /**
     * 出生日期
     */
    @TableField("Mem_Birth")
    private Date memBirth;
    /**
     * 经验
     */
    @TableField("Mem_Experience")
    private Long memExperience;
    /**
     * 上次登录
     */
    @TableField("Mem_LastLogin")
    private Date memLastlogin;


    public Long getMemId() {
        return memId;
    }

    public void setMemId(Long memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemPassword() {
        return memPassword;
    }

    public void setMemPassword(String memPassword) {
        this.memPassword = memPassword;
    }

    public String getMemTelephone() {
        return memTelephone;
    }

    public void setMemTelephone(String memTelephone) {
        this.memTelephone = memTelephone;
    }

    public String getMemEmail() {
        return memEmail;
    }

    public void setMemEmail(String memEmail) {
        this.memEmail = memEmail;
    }

    public Long getMemWatchquantity() {
        return memWatchquantity;
    }

    public void setMemWatchquantity(Long memWatchquantity) {
        this.memWatchquantity = memWatchquantity;
    }

    public Long getMemFansquantity() {
        return memFansquantity;
    }

    public void setMemFansquantity(Long memFansquantity) {
        this.memFansquantity = memFansquantity;
    }

    public String getMemPortrait() {
        return memPortrait;
    }

    public void setMemPortrait(String memPortrait) {
        this.memPortrait = memPortrait;
    }

    public String getMemAutograph() {
        return memAutograph;
    }

    public void setMemAutograph(String memAutograph) {
        this.memAutograph = memAutograph;
    }

    public Long getMemCoinquantity() {
        return memCoinquantity;
    }

    public void setMemCoinquantity(Long memCoinquantity) {
        this.memCoinquantity = memCoinquantity;
    }

    public Integer getMemLevel() {
        return memLevel;
    }

    public void setMemLevel(Integer memLevel) {
        this.memLevel = memLevel;
    }

    public Date getMemRegistertime() {
        return memRegistertime;
    }

    public void setMemRegistertime(Date memRegistertime) {
        this.memRegistertime = memRegistertime;
    }

    public String getMemSex() {
        return memSex;
    }

    public void setMemSex(String memSex) {
        this.memSex = memSex;
    }

    public Date getMemBirth() {
        return memBirth;
    }

    public void setMemBirth(Date memBirth) {
        this.memBirth = memBirth;
    }

    public Long getMemExperience() {
        return memExperience;
    }

    public void setMemExperience(Long memExperience) {
        this.memExperience = memExperience;
    }

    public Date getMemLastlogin() {
        return memLastlogin;
    }

    public void setMemLastlogin(Date memLastlogin) {
        this.memLastlogin = memLastlogin;
    }

    @Override
    protected Serializable pkVal() {
        return this.memId;
    }

    @Override
    public String toString() {
        return "Member{" +
        ", memId=" + memId +
        ", memName=" + memName +
        ", memPassword=" + memPassword +
        ", memTelephone=" + memTelephone +
        ", memEmail=" + memEmail +
        ", memWatchquantity=" + memWatchquantity +
        ", memFansquantity=" + memFansquantity +
        ", memPortrait=" + memPortrait +
        ", memAutograph=" + memAutograph +
        ", memCoinquantity=" + memCoinquantity +
        ", memLevel=" + memLevel +
        ", memRegistertime=" + memRegistertime +
        ", memSex=" + memSex +
        ", memBirth=" + memBirth +
        ", memExperience=" + memExperience +
        ", memLastlogin=" + memLastlogin +
        "}";
    }
}
