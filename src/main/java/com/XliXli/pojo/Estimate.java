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
 * 评论表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "estimate")
public class Estimate extends Model<Estimate> {

    /**
     * 评论编号
     */
    @TableId(value = "ES_Id", type = IdType.AUTO)
    private Long esId;
    /**
     * 评论内容
     */
    @TableField("ES_Content")
    private String esContent;
    /**
     * 发送者
     */
    @TableField("ES_UserId")
    private Long esUserid;
    /**
     * 评论归属
     */
    @TableField("ES_OriginType")
    private Long esOriginType;
    /**
     * 归属号
     */
    @TableField("ES_OriginId")
    private Long esOriginid;
    /**
     * 回复编号
     */
    @TableField("ES_ReplyId")
    private Long esReplyid;
    /**
     * 点赞数
     */
    @TableField("ES_PraiseQuantity")
    private Long esPraisequantity;
    /**
     * 发送时间
     */
    @TableField("ES_CreatTime")
    private Date esCreattime;

    public Long getEsId() {
        return esId;
    }

    public void setEsId(Long esId) {
        this.esId = esId;
    }

    public String getEsContent() {
        return esContent;
    }

    public void setEsContent(String esContent) {
        this.esContent = esContent;
    }

    public Long getEsUserid() {
        return esUserid;
    }

    public void setEsUserid(Long esUserid) {
        this.esUserid = esUserid;
    }

    public Long getEsOriginType() {
        return esOriginType;
    }

    public void setEsOriginType(Long esOriginType) {
        this.esOriginType = esOriginType;
    }

    public Long getEsOriginid() {
        return esOriginid;
    }

    public void setEsOriginid(Long esOriginid) {
        this.esOriginid = esOriginid;
    }

    public Long getEsReplyid() {
        return esReplyid;
    }

    public void setEsReplyid(Long esReplyid) {
        this.esReplyid = esReplyid;
    }

    public Long getEsPraisequantity() {
        return esPraisequantity;
    }

    public void setEsPraisequantity(Long esPraisequantity) {
        this.esPraisequantity = esPraisequantity;
    }

    public Date getEsCreattime() {
        return esCreattime;
    }

    public void setEsCreattime(Date esCreattime) {
        this.esCreattime = esCreattime;
    }

    @Override
    protected Serializable pkVal() {
        return this.esId;
    }

    @Override
    public String toString() {
        return "Estimate{" +
        ", esId=" + esId +
        ", esContent=" + esContent +
        ", esUserid=" + esUserid +
        ", esType=" + esOriginType +
        ", esOriginid=" + esOriginid +
        ", esReplyid=" + esReplyid +
        ", esPraisequantity=" + esPraisequantity +
        ", esCreattime=" + esCreattime +
        "}";
    }
}
