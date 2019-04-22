package com.XliXli.service.impl;

import com.XliXli.mapper.MemberMapper;
import com.XliXli.pojo.Member;
import com.XliXli.service.MemberService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author chenwei
 * @since 2019-04-19
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

    @Override
    public int createMember(Member member) {
        return 0;
    }

    @Override
    public int deleteMemberById(Long Mem_Id) {
        return 0;
    }

    @Override
    public int updateMemberById(Long Mem_Id, Member member, Boolean isNull) {
        return 0;
    }

    @Override
    public Member findById(Long Mem_Id) {
        return null;
    }

    @Override
    public List<Member> findByWatFansId(Long Wat_FansId) {
        return null;
    }

    @Override
    public List<Member> findByWatUserId(Long Wat_UserId) {
        return null;
    }

    @Override
    public List<Member> findByName(String Mem_Name) {
        return null;
    }
}
