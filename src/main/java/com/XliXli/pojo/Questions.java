package com.XliXli.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 题库表
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@TableName(value = "questions")
public class Questions extends Model<Questions> {

    /**
     * 题目编号
     */
    @TableId(value = "Ques_Id", type = IdType.AUTO)
    private Long quesId;
    /**
     * 题目内容
     */
    @TableField("Ques_Name")
    private String quesName;
    /**
     * 正确答案
     */
    @TableField("Ques_Answer")
    private String quesAnswer;


    public Long getQuesId() {
        return quesId;
    }

    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }

    public String getQuesName() {
        return quesName;
    }

    public void setQuesName(String quesName) {
        this.quesName = quesName;
    }

    public String getQuesAnswer() {
        return quesAnswer;
    }

    public void setQuesAnswer(String quesAnswer) {
        this.quesAnswer = quesAnswer;
    }

    @Override
    protected Serializable pkVal() {
        return this.quesId;
    }

    @Override
    public String toString() {
        return "Questions{" +
        ", quesId=" + quesId +
        ", quesName=" + quesName +
        ", quesAnswer=" + quesAnswer +
        "}";
    }
}
