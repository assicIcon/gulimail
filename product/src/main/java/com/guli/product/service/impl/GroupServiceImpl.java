package com.guli.product.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.product.entity.Group;
import com.guli.product.mapper.GroupMapper;
import com.guli.product.service.GroupService;
import org.springframework.stereotype.Service;

/**
 * GroupService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class GroupServiceImpl extends ServiceImpl<Group> implements GroupService {

	protected GroupServiceImpl(GroupMapper mapper) {
		super(mapper);
	}
}