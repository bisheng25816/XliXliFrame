package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 图片表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "picture")
public class Picture extends Model<Picture> {

    /**
     * 图片编号
     */
    @TableId(value = "P_Id", type = IdType.AUTO)
    private Long pId;
    /**
     * 图片主人
     */
    @TableField("P_UserId")
    private Long pUserid;
    /**
     * 图片名
     */
    @TableField("P_Name")
    private String pName;
    /**
     * 图片地址
     */
    @TableField("P_Url")
    private String pUrl;
    /**
     * 所属相册
     */
    @TableField("P_PAId")
    private Long pPaid;
    /**
     * 所属动态
     */
    @TableField("P_ACId")
    private Long pAcid;


    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public Long getpUserid() {
        return pUserid;
    }

    public void setpUserid(Long pUserid) {
        this.pUserid = pUserid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
    }

    public Long getpPaid() {
        return pPaid;
    }

    public void setpPaid(Long pPaid) {
        this.pPaid = pPaid;
    }

    public Long getpAcid() {
        return pAcid;
    }

    public void setpAcid(Long pAcid) {
        this.pAcid = pAcid;
    }

    @Override
    protected Serializable pkVal() {
        return this.pId;
    }

    @Override
    public String toString() {
        return "Picture{" +
        ", pId=" + pId +
        ", pUserid=" + pUserid +
        ", pName=" + pName +
        ", pUrl=" + pUrl +
        ", pPaid=" + pPaid +
        ", pAcid=" + pAcid +
        "}";
    }
}
