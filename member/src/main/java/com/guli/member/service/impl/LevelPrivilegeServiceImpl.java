package com.guli.member.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.member.entity.LevelPrivilege;
import com.guli.member.mapper.LevelPrivilegeMapper;
import com.guli.member.service.LevelPrivilegeService;
import org.springframework.stereotype.Service;

/**
 * LevelPrivilegeServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class LevelPrivilegeServiceImpl extends ServiceImpl<LevelPrivilege> implements LevelPrivilegeService {

	protected LevelPrivilegeServiceImpl(LevelPrivilegeMapper mapper) {
		super(mapper);
	}

}
