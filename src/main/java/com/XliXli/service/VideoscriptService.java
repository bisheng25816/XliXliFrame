package com.XliXli.service;

import com.XliXli.pojo.Videoscript;
import com.baomidou.mybatisplus.service.IService;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 视频稿件表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface VideoscriptService extends IService<Videoscript> {
    //添加稿件
    public int createVideoscript(Videoscript videoscript);
    //按照ID逻辑删除稿件
    public int logicDeleteVideoscriptById(Long VS_Id);
    //按照ID删除稿件
    public int deleteVideoscriptById(Long VS_Id);
    //按ID集合逻辑删除稿件
    public int logicDeleteVideoscriptByIdList(List<Long> VS_IdList);
    //按ID集合删除稿件
    public int deleteVideoscriptByIdList(List<Long> VS_IdList);
    /*按照ID修改稿件,是否支持对象部分属性为空
     true：对象属性可以只封装一部分，其余空值部分不影响数据库列原有值
     false：将数据库中字段改为null*/
    public int updateVideoscriptById(Long VS_Id,Videoscript videoscript,Boolean isNull);
    /*按照ID集合修改稿件,是否支持对象部分属性为空
     true：对象属性可以只封装一部分，其余空值部分不影响数据库列原有值
     false：将数据库中字段改为null*/
    public int updateVideoscriptByIdList(List<Long> VS_IdList,Videoscript videoscript,Boolean isNull);
    //按ID查询稿件
    public Videoscript findById(Long VS_Id,Boolean boo,Integer index,Integer size);
    /*查询全部稿件
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Videoscript> findAll(Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按名字查询稿件
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Videoscript> findByName(String VS_Name,Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按关键字查询稿件
     查询所有标签、分类、上传者等信息为关键字的稿件
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Videoscript> findByKeyWord(String KeyWord,Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按ID集合查询稿件
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Videoscript> findByIdList(List<Long> VS_IdList,Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按类型查询稿件
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Videoscript> findByVSType(Long VST_Id,Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按标签查询稿件
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Videoscript> findByLBType(Long LB_Id,Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按时长区间查询稿件
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Videoscript> findByDuration(Long MinDuration,Long MaxDuration,Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按开播时间查询番剧
        是否分页
        第几页开始，每页大小
        依赖的排序字段，为空则不排序
        排序规则，1：升序，2：降序*/
    public List<Videoscript> findByRelease(Date UploadTime,Long MaxDuration,Boolean boo,Integer index,Integer size,String column,Integer rule);

}
