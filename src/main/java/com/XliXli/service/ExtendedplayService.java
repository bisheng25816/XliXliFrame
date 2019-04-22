package com.XliXli.service;

import com.XliXli.pojo.Extendedplay;
import com.baomidou.mybatisplus.service.IService;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 番剧表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface ExtendedplayService extends IService<Extendedplay> {
    //按ID查询番剧
    public Extendedplay findById(Long EP_Id);
    /*查询全部番剧
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Extendedplay> findAll(Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按名字查询番剧
      查询所有标签、分类、作者、声优等信息为关键字的番剧
      是否分页
      第几页开始，每页大小
      依赖的排序字段，为空则不排序
      排序规则，1：升序，2：降序*/
    public List<Extendedplay> findByName(String EP_Name,Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按关键字查询番剧
     查询所有标签、分类、作者、声优等信息为关键字的番剧
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Extendedplay> findByKeyWord(String KeyWord,Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按ID集合查询番剧
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Extendedplay> findByIdList(List EP_IdList,Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按类型查询番剧
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Extendedplay> findByVSType(Long VST_Id,Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按标签查询番剧
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Extendedplay> findByLBType(Long LB_Id,Boolean boo,Integer index,Integer size,String column,Integer rule);
    /*按开播时间查询番剧
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Extendedplay> findByRelease(Date Release,Long MaxDuration, Boolean boo, Integer index, Integer size, String column, Integer rule);
    /*按完结状态查询番剧
     是否分页
     第几页开始，每页大小
     依赖的排序字段，为空则不排序
     排序规则，1：升序，2：降序*/
    public List<Extendedplay> findByState(Long State,Long MaxDuration,Boolean boo,Integer index,Integer size,String column,Integer rule);
}
