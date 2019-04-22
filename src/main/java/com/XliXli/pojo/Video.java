package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 视频表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "video")
public class Video extends Model<Video> {

    /**
     * 视频编号
     */
    @TableId(value = "V_Id", type = IdType.AUTO)
    private Long vId;
    /**
     * 发送者
     */
    @TableField("V_UserId")
    private Long vUserid;
    /**
     * 视频名称
     */
    @TableField("V_Name")
    private String vName;
    /**
     * 视频地址
     */
    @TableField("V_Url")
    private String vUrl;
    /**
     * 视频时长
     */
    @TableField("V_Duration")
    private Long vDuration;
    /**
     * 视频归属
     */
    @TableField("V_OriginType")
    private Long vOriginType;
    /**
     * 归属号
     */
    @TableField("V_OriginId")
    private Long vOriginid;
    /**
     * 分P号
     */
    @TableField("V_PNum")
    private Long vPNum;

    public Long getvId() {
        return vId;
    }

    public void setvId(Long vId) {
        this.vId = vId;
    }

    public Long getvUserid() {
        return vUserid;
    }

    public void setvUserid(Long vUserid) {
        this.vUserid = vUserid;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getvUrl() {
        return vUrl;
    }

    public void setvUrl(String vUrl) {
        this.vUrl = vUrl;
    }

    public Long getvDuration() {
        return vDuration;
    }

    public void setvDuration(Long vDuration) {
        this.vDuration = vDuration;
    }

    public Long getvOriginType() {
        return vOriginType;
    }

    public void setvOriginType(Long vOriginType) {
        this.vOriginType = vOriginType;
    }

    public Long getvOriginid() {
        return vOriginid;
    }

    public void setvOriginid(Long vOriginid) {
        this.vOriginid = vOriginid;
    }

    public Long getvPNum() {
        return vPNum;
    }

    public void setvPNum(Long vPNum) {
        this.vPNum = vPNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.vId;
    }

    @Override
    public String toString() {
        return "Video{" +
        ", vId=" + vId +
        ", vUserid=" + vUserid +
        ", vName=" + vName +
        ", vUrl=" + vUrl +
        ", vOriginType=" + vOriginType +
        ", vOriginid=" + vOriginid +
        "}";
    }
}
