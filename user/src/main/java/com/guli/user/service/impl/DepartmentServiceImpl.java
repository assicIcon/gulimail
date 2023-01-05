package com.guli.user.service.impl;


import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.user.entity.Department;
import com.guli.user.mapper.DepartmentMapper;
import com.guli.user.service.DepartmentService;
import org.springframework.stereotype.Service;

/**
 * Department
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class DepartmentServiceImpl extends ExampleSupportServiceImpl<Department> implements DepartmentService {

	public DepartmentServiceImpl(DepartmentMapper mapper) {
		super(mapper);
	}
}

