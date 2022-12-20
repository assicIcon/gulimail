package com.guli.member.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.member.entity.MemberIntegrationFlow;
import com.guli.member.mapper.MemberIntegrationFlowMapper;
import com.guli.member.service.MemberIntegrationFlowService;
import org.springframework.stereotype.Service;

/**
 * MemberIntegrationFlowServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class MemberIntegrationFlowServiceImpl extends ExampleSupportServiceImpl<MemberIntegrationFlow> implements MemberIntegrationFlowService {

	protected MemberIntegrationFlowServiceImpl(MemberIntegrationFlowMapper mapper) {
		super(mapper);
	}
}
