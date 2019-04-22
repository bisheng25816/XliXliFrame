package com.XliXli.service;

import com.XliXli.pojo.Chaseep;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 追番表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface ChaseepService extends IService<Chaseep> {
    //增加追番
    public int createChaseep(Chaseep chaseep);
    //按照Id删除追番
    public Chaseep deleteChaseep(Long CEP_Id);
    //按照Id查询追番
    public Chaseep findById(Long CEP_Id);
    //按照Id集合查询追番
    public Chaseep findByIdList(List<Long> CEP_IdList);
    //按照追番者查询追番
    public List<Chaseep> findByUserId(Long CEP_UserId);
    //按照番剧查询追番
    public List<Chaseep> findByEPId(Long CEP_EPId);
}
