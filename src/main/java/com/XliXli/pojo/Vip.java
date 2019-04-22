package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 会员权限表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "vip")
public class Vip extends Model<Vip> {

    /**
     * 类型编号
     */
    @TableId(value = "VIP_Id", type = IdType.AUTO)
    private Long vipId;
    /**
     * 会员等级
     */
    @TableField("VIP_level")
    private Integer vipLevel;
    /**
     * 会员权限
     */
    @TableField("VIP_Power")
    private Integer vipPower;
    /**
     * 权限描述
     */
    @TableField("VIP_PowerDescribe")
    private String vipPowerdescribe;


    public Long getVipId() {
        return vipId;
    }

    public void setVipId(Long vipId) {
        this.vipId = vipId;
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getVipPower() {
        return vipPower;
    }

    public void setVipPower(Integer vipPower) {
        this.vipPower = vipPower;
    }

    public String getVipPowerdescribe() {
        return vipPowerdescribe;
    }

    public void setVipPowerdescribe(String vipPowerdescribe) {
        this.vipPowerdescribe = vipPowerdescribe;
    }

    @Override
    protected Serializable pkVal() {
        return this.vipId;
    }

    @Override
    public String toString() {
        return "Vip{" +
        ", vipId=" + vipId +
        ", vipLevel=" + vipLevel +
        ", vipPower=" + vipPower +
        ", vipPowerdescribe=" + vipPowerdescribe +
        "}";
    }
}
