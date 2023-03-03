package com.guli.member.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.member.entity.MemberGrowthFlow;
import com.guli.member.mapper.MemberGrowthFlowMapper;
import com.guli.member.service.MemberGrowthFlowService;
import org.springframework.stereotype.Service;

/**
 * MemberGrowthFlowServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class MemberGrowthFlowServiceImpl extends ServiceImpl<MemberGrowthFlow> implements MemberGrowthFlowService {

	protected MemberGrowthFlowServiceImpl(MemberGrowthFlowMapper mapper) {
		super(mapper);
	}

}
