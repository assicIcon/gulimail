package com.guli.user.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.user.entity.UserRole;
import com.guli.user.mapper.UserRoleMapper;
import com.guli.user.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * UserRole
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRole> implements UserRoleService {

	public UserRoleServiceImpl(UserRoleMapper mapper) {
		super(mapper);
	}
}
