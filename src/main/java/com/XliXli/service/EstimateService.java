package com.XliXli.service;

import com.XliXli.pojo.Estimate;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 评论表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface EstimateService extends IService<Estimate> {
    //添加评论
    public int createEstimate(Estimate estimate);
    //按照ID删除评论
    public int deleteEstimateById(Long ES_Id);
    /*按照ID修改评论
     true：对象属性可以只封装一部分，其余空值部分不影响数据库列原有值
     false：将数据库中字段改为null*/
    public int updateEstimateById(Long ES_Id,Estimate estimate);
    //按照ID查询评论
    public Estimate findById(Long ES_Id);
    /*按照归属查询评论
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Estimate> findByOrigin(Long ES_OriginType,Long ES_OriginId,Boolean boo,Integer index,Integer size,String column,Integer rule);
    //按照发送者查询评论
    public List<Estimate> findByUserId(Long ES_UserId);
    //按照回复编号查询评论
    public List<Estimate> findByReplyId(Long ES_ReplyId);
    //按照发送时间查询评论
    public List<Estimate> findByCreatTime(Long ES_CreatTime);
}
