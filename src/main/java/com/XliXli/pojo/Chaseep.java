package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 追番表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "chaseep")
public class Chaseep extends Model<Chaseep> {

    /**
     * 追番编号
     */
    @TableId(value = "CEP_Id", type = IdType.AUTO)
    private Long cepId;
    /**
     * 追番者
     */
    @TableField("CEP_UserId")
    private Long cepUserid;
    /**
     * 番剧编号
     */
    @TableField("CEP_EPId")
    private Long cepEpid;


    public Long getCepId() {
        return cepId;
    }

    public void setCepId(Long cepId) {
        this.cepId = cepId;
    }

    public Long getCepUserid() {
        return cepUserid;
    }

    public void setCepUserid(Long cepUserid) {
        this.cepUserid = cepUserid;
    }

    public Long getCepEpid() {
        return cepEpid;
    }

    public void setCepEpid(Long cepEpid) {
        this.cepEpid = cepEpid;
    }

    @Override
    protected Serializable pkVal() {
        return this.cepId;
    }

    @Override
    public String toString() {
        return "Chaseep{" +
        ", cepId=" + cepId +
        ", cepUserid=" + cepUserid +
        ", cepEpid=" + cepEpid +
        "}";
    }
}
