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
 * 弹幕表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "barrage")
public class Barrage extends Model<Barrage> {

    /**
     * 弹幕编号
     */
    @TableId(value = "BA_Id", type = IdType.AUTO)
    private Long baId;
    /**
     * 弹幕内容
     */
    @TableField("BA_Content")
    private String baContent;
    /**
     * 发送者
     */
    @TableField("BA_UserId")
    private Long baUserid;
    /**
     * 视频编号
     */
    @TableField("BA_VId")
    private Long baVid;
    /**
     * 字体
     */
    @TableField("BA_Font")
    private Long baFont;
    /**
     * 颜色
     */
    @TableField("BA_Colour")
    private Long baColour;
    /**
     * 模式
     */
    @TableField("BA_Pattern")
    private Long baPattern;
    /**
     * 发送时间
     */
    @TableField("BA_CreatTime")
    private Date baCreattime;
    /**
     * 视频秒数
     */
    @TableField("BA_VideoTime")
    private Long baVideotime;


    public Long getBaId() {
        return baId;
    }

    public void setBaId(Long baId) {
        this.baId = baId;
    }

    public String getBaContent() {
        return baContent;
    }

    public void setBaContent(String baContent) {
        this.baContent = baContent;
    }

    public Long getBaUserid() {
        return baUserid;
    }

    public void setBaUserid(Long baUserid) {
        this.baUserid = baUserid;
    }

    public Long getBaVid() {
        return baVid;
    }

    public void setBaVid(Long baVid) {
        this.baVid = baVid;
    }

    public Long getBaFont() {
        return baFont;
    }

    public void setBaFont(Long baFont) {
        this.baFont = baFont;
    }

    public Long getBaColour() {
        return baColour;
    }

    public void setBaColour(Long baColour) {
        this.baColour = baColour;
    }

    public Long getBaPattern() {
        return baPattern;
    }

    public void setBaPattern(Long baPattern) {
        this.baPattern = baPattern;
    }

    public Date getBaCreattime() {
        return baCreattime;
    }

    public void setBaCreattime(Date baCreattime) {
        this.baCreattime = baCreattime;
    }

    public Long getBaVideotime() {
        return baVideotime;
    }

    public void setBaVideotime(Long baVideotime) {
        this.baVideotime = baVideotime;
    }

    @Override
    protected Serializable pkVal() {
        return this.baId;
    }

    @Override
    public String toString() {
        return "Barrage{" +
        ", baId=" + baId +
        ", baContent=" + baContent +
        ", baUserid=" + baUserid +
        ", baVid=" + baVid +
        ", baFont=" + baFont +
        ", baColour=" + baColour +
        ", baPattern=" + baPattern +
        ", baCreattime=" + baCreattime +
        ", baVideotime=" + baVideotime +
        "}";
    }
}
