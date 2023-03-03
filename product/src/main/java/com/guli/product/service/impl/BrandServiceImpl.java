package com.guli.product.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.product.entity.Brand;
import com.guli.product.mapper.BrandMapper;
import com.guli.product.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * BrandService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class BrandServiceImpl extends ServiceImpl<Brand> implements BrandService {

	protected BrandServiceImpl(BrandMapper mapper) {
		super(mapper);
	}
}
