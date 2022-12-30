package com.guli.product.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.product.entity.Category;
import com.guli.product.mapper.CategoryMapper;
import com.guli.product.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * CategoryService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class CategoryServiceImpl extends ExampleSupportServiceImpl<Category> implements CategoryService {

	protected CategoryServiceImpl(CategoryMapper mapper) {
		super(mapper);
	}
}
