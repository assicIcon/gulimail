package com.guli.user.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.user.entity.RolePermission;
import com.guli.user.mapper.RolePermissionMapper;
import com.guli.user.service.RolePermissionService;
import org.springframework.stereotype.Service;

/**
 * RolePermission
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermission> implements RolePermissionService {

	public RolePermissionServiceImpl(RolePermissionMapper mapper) {
		super(mapper);
	}
}
