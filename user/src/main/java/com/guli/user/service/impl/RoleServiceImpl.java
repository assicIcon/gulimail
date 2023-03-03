package com.guli.user.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.user.entity.Role;
import com.guli.user.mapper.RoleMapper;
import com.guli.user.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * Role
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class RoleServiceImpl extends ServiceImpl<Role> implements RoleService {

	public RoleServiceImpl(RoleMapper mapper) {
		super(mapper);
	}
}
