package com.guli.member.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.member.entity.Privilege;
import com.guli.member.mapper.PrivilegeMapper;
import com.guli.member.service.PrivilegeService;
import org.springframework.stereotype.Service;

/**
 * PrivilegeServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class PrivilegeServiceImpl extends ExampleSupportServiceImpl<Privilege> implements PrivilegeService {

	protected PrivilegeServiceImpl(PrivilegeMapper mapper) {
		super(mapper);
	}
}
