package com.XliXli.service;

import com.XliXli.pojo.Member;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
public interface MemberService extends IService<Member> {
    //添加用户
    public int createMember(Member member);
    //按照ID删除用户
    public int deleteMemberById(Long Mem_Id);
    /*按照ID修改用户,是否支持对象部分属性为空
    true：对象属性可以只封装一部分，其余空值部分不影响数据库列原有值
    false：将数据库中字段改为null*/
    public int updateMemberById(Long Mem_Id,Member member,Boolean isNull);
    //按照ID查询用户
    public Member findById(Long Mem_Id);
    //根据粉丝ID查询被关注的用户
    public List<Member> findByWatFansId(Long Wat_FansId);
    //根据用户ID查询粉丝用户
    public List<Member> findByWatUserId(Long Wat_UserId);
    //根据名字查询用户
    public List<Member> findByName(String Mem_Name);
}
