package com.guli.product.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.product.entity.BrandCategory;
import com.guli.product.mapper.BrandCategoryMapper;
import com.guli.product.service.BrandCategoryService;
import org.springframework.stereotype.Service;

/**
 * BrandCategoryService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class BrandCategoryServiceImpl extends ServiceImpl<BrandCategory> implements BrandCategoryService {

	protected BrandCategoryServiceImpl(BrandCategoryMapper mapper) {
		super(mapper);
	}
}
