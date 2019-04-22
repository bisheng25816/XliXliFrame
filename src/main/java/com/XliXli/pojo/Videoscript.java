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
 * 视频稿件表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "videoscript")
public class Videoscript extends Model<Videoscript> {

    /**
     * 稿件编号
     */
    @TableId(value = "VS_Id", type = IdType.AUTO)
    private Long vsId;
    /**
     * 稿件名称
     */
    @TableField("VS_Name")
    private String vsName;
    /**
     * 上传者
     */
    @TableField("VS_UserId")
    private Long vsUserid;
    /**
     * 时长
     */
    @TableField("VS_Duration")
    private Long vsDuration;
    /**
     * 简介
     */
    @TableField("VS_Introduce")
    private String vsIntroduce;
    /**
     * 上传时间
     */
    @TableField("VS_UploadTime")
    private Date vsUploadtime;
    /**
     * 评论数
     */
    @TableField("VS_CommentQuantity")
    private Long vsCommentquantity;
    /**
     * 硬币数
     */
    @TableField("VS_CoinQuantity")
    private Long vsCoinquantity;
    /**
     * 点赞数
     */
    @TableField("VS_PraiseQuantity")
    private Long vsPraisequantity;
    /**
     * 收藏数
     */
    @TableField("VS_CollecQuantity")
    private Long vsCollecquantity;
    /**
     * 播放量
     */
    @TableField("VS_PlayQuantity")
    private Long vsPlayquantity;
    /**
     * 弹幕量
     */
    @TableField("VS_BarrageQuantity")
    private Long vsBarragequantity;
    /**
     * 分类
     */
    @TableField("VS_Type")
    private Long vsType;
    /**
     * 标签
     */
    @TableField("VS_Label")
    private Long vsLabel;
    /**
     * 封面
     */
    @TableField("VS_Cover")
    private String vsCover;
    /**
     * 所属动态
     */
    @TableField("VS_ACId")
    private Long vsAcid;
    /**
     * 逻辑删除
     */
    @TableField("VS_LogicDel")
    private Integer vsLogicdel;


    public Long getVsId() {
        return vsId;
    }

    public void setVsId(Long vsId) {
        this.vsId = vsId;
    }

    public String getVsName() {
        return vsName;
    }

    public void setVsName(String vsName) {
        this.vsName = vsName;
    }

    public Long getVsUserid() {
        return vsUserid;
    }

    public void setVsUserid(Long vsUserid) {
        this.vsUserid = vsUserid;
    }

    public Long getVsDuration() {
        return vsDuration;
    }

    public void setVsDuration(Long vsDuration) {
        this.vsDuration = vsDuration;
    }

    public String getVsIntroduce() {
        return vsIntroduce;
    }

    public void setVsIntroduce(String vsIntroduce) {
        this.vsIntroduce = vsIntroduce;
    }

    public Date getVsUploadtime() {
        return vsUploadtime;
    }

    public void setVsUploadtime(Date vsUploadtime) {
        this.vsUploadtime = vsUploadtime;
    }

    public Long getVsCommentquantity() {
        return vsCommentquantity;
    }

    public void setVsCommentquantity(Long vsCommentquantity) {
        this.vsCommentquantity = vsCommentquantity;
    }

    public Long getVsCoinquantity() {
        return vsCoinquantity;
    }

    public void setVsCoinquantity(Long vsCoinquantity) {
        this.vsCoinquantity = vsCoinquantity;
    }

    public Long getVsPraisequantity() {
        return vsPraisequantity;
    }

    public void setVsPraisequantity(Long vsPraisequantity) {
        this.vsPraisequantity = vsPraisequantity;
    }

    public Long getVsCollecquantity() {
        return vsCollecquantity;
    }

    public void setVsCollecquantity(Long vsCollecquantity) {
        this.vsCollecquantity = vsCollecquantity;
    }

    public Long getVsPlayquantity() {
        return vsPlayquantity;
    }

    public void setVsPlayquantity(Long vsPlayquantity) {
        this.vsPlayquantity = vsPlayquantity;
    }

    public Long getVsBarragequantity() {
        return vsBarragequantity;
    }

    public void setVsBarragequantity(Long vsBarragequantity) {
        this.vsBarragequantity = vsBarragequantity;
    }

    public Long getVsType() {
        return vsType;
    }

    public void setVsType(Long vsType) {
        this.vsType = vsType;
    }

    public Long getVsLabel() {
        return vsLabel;
    }

    public void setVsLabel(Long vsLabel) {
        this.vsLabel = vsLabel;
    }

    public String getVsCover() {
        return vsCover;
    }

    public void setVsCover(String vsCover) {
        this.vsCover = vsCover;
    }

    public Long getVsAcid() {
        return vsAcid;
    }

    public void setVsAcid(Long vsAcid) {
        this.vsAcid = vsAcid;
    }

    public Integer getVsLogicdel() {
        return vsLogicdel;
    }

    public void setVsLogicdel(Integer vsLogicdel) {
        this.vsLogicdel = vsLogicdel;
    }

    @Override
    protected Serializable pkVal() {
        return this.vsId;
    }

    @Override
    public String toString() {
        return "Videoscript{" +
        ", vsId=" + vsId +
        ", vsName=" + vsName +
        ", vsUserid=" + vsUserid +
        ", vsDuration=" + vsDuration +
        ", vsIntroduce=" + vsIntroduce +
        ", vsUploadtime=" + vsUploadtime +
        ", vsCommentquantity=" + vsCommentquantity +
        ", vsCoinquantity=" + vsCoinquantity +
        ", vsPraisequantity=" + vsPraisequantity +
        ", vsCollecquantity=" + vsCollecquantity +
        ", vsPlayquantity=" + vsPlayquantity +
        ", vsBarragequantity=" + vsBarragequantity +
        ", vsType=" + vsType +
        ", vsLabel=" + vsLabel +
        ", vsCover=" + vsCover +
        ", vsAcid=" + vsAcid +
        ", vsLogicdel=" + vsLogicdel +
        "}";
    }
}
