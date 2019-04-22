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
 * 番剧表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "extendedplay")
public class Extendedplay extends Model<Extendedplay> {

    /**
     * 番剧编号
     */
    @TableId(value = "EP_Id", type = IdType.AUTO)
    private Long epId;
    /**
     * 番剧名称
     */
    @TableField("EP_Name")
    private String epName;
    /**
     * 制作人
     */
    @TableField("EP_STAFF")
    private String epStaff;
    /**
     * 角色声优
     */
    @TableField("EP_VoiceActor")
    private String epVoiceactor;
    /**
     * 简介
     */
    @TableField("EP_Introduce")
    private String epIntroduce;
    /**
     * 开播时间
     */
    @TableField("EP_Release")
    private Date epRelease;
    /**
     * 完结状态
     */
    @TableField("EP_State")
    private Long epState;
    /**
     * 评论数
     */
    @TableField("EP_CommentQuantity")
    private Long epCommentquantity;
    /**
     * 投币数
     */
    @TableField("EP_CoinQuantity")
    private Long epCoinquantity;
    /**
     * 追番人数
     */
    @TableField("EP_CollecQuantity")
    private Long epCollecquantity;
    /**
     * 播放量
     */
    @TableField("EP_PlayQuantity")
    private Long epPlayquantity;
    /**
     * 弹幕量
     */
    @TableField("EP_BarrageQuantity")
    private Long epBarragequantity;
    /**
     * 分类
     */
    @TableField("EP_Type")
    private Long epType;
    /**
     * 标签
     */
    @TableField("EP_Label")
    private Long epLabel;
    /**
     * 封面
     */
    @TableField("EP_Cover")
    private String epCover;

    public Long getEpId() {
        return epId;
    }

    public void setEpId(Long epId) {
        this.epId = epId;
    }

    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public String getEpStaff() {
        return epStaff;
    }

    public void setEpStaff(String epStaff) {
        this.epStaff = epStaff;
    }

    public String getEpVoiceactor() {
        return epVoiceactor;
    }

    public void setEpVoiceactor(String epVoiceactor) {
        this.epVoiceactor = epVoiceactor;
    }

    public String getEpIntroduce() {
        return epIntroduce;
    }

    public void setEpIntroduce(String epIntroduce) {
        this.epIntroduce = epIntroduce;
    }

    public Date getEpRelease() {
        return epRelease;
    }

    public void setEpRelease(Date epRelease) {
        this.epRelease = epRelease;
    }

    public Long getEpState() {
        return epState;
    }

    public void setEpState(Long epState) {
        this.epState = epState;
    }

    public Long getEpCommentquantity() {
        return epCommentquantity;
    }

    public void setEpCommentquantity(Long epCommentquantity) {
        this.epCommentquantity = epCommentquantity;
    }

    public Long getEpCoinquantity() {
        return epCoinquantity;
    }

    public void setEpCoinquantity(Long epCoinquantity) {
        this.epCoinquantity = epCoinquantity;
    }

    public Long getEpCollecquantity() {
        return epCollecquantity;
    }

    public void setEpCollecquantity(Long epCollecquantity) {
        this.epCollecquantity = epCollecquantity;
    }

    public Long getEpPlayquantity() {
        return epPlayquantity;
    }

    public void setEpPlayquantity(Long epPlayquantity) {
        this.epPlayquantity = epPlayquantity;
    }

    public Long getEpBarragequantity() {
        return epBarragequantity;
    }

    public void setEpBarragequantity(Long epBarragequantity) {
        this.epBarragequantity = epBarragequantity;
    }

    public Long getEpType() {
        return epType;
    }

    public void setEpType(Long epType) {
        this.epType = epType;
    }

    public Long getEpLabel() {
        return epLabel;
    }

    public void setEpLabel(Long epLabel) {
        this.epLabel = epLabel;
    }

    public String getEpCover() {
        return epCover;
    }

    public void setEpCover(String epCover) {
        this.epCover = epCover;
    }

    @Override
    protected Serializable pkVal() {
        return this.epId;
    }

    @Override
    public String toString() {
        return "Extendedplay{" +
        ", epId=" + epId +
        ", epName=" + epName +
        ", epStaff=" + epStaff +
        ", epVoiceactor=" + epVoiceactor +
        ", epIntroduce=" + epIntroduce +
        ", epRelease=" + epRelease +
        ", epState=" + epState +
        ", epCommentquantity=" + epCommentquantity +
        ", epCoinquantity=" + epCoinquantity +
        ", epCollecquantity=" + epCollecquantity +
        ", epPlayquantity=" + epPlayquantity +
        ", epBarragequantity=" + epBarragequantity +
        ", epType=" + epType +
        ", epLabel=" + epLabel +
        ", epCover=" + epCover +
        "}";
    }
}
