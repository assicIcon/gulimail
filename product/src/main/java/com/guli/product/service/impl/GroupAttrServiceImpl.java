package com.guli.product.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.product.entity.GroupAttr;
import com.guli.product.mapper.GroupAttrMapper;
import com.guli.product.service.GroupAttrService;
import org.springframework.stereotype.Service;

/**
 * GroupAttrService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class GroupAttrServiceImpl extends ExampleSupportServiceImpl<GroupAttr> implements GroupAttrService {

	protected GroupAttrServiceImpl(GroupAttrMapper mapper) {
		super(mapper);
	}
}
