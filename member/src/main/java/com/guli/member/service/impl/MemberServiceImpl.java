package com.guli.member.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.member.entity.Member;
import com.guli.member.mapper.MemberMapper;
import com.guli.member.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * MemberServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class MemberServiceImpl extends ServiceImpl<Member> implements MemberService {

	protected MemberServiceImpl(MemberMapper mapper) {
		super(mapper);
	}

}
