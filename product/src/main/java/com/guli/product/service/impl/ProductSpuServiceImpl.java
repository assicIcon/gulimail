package com.guli.product.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.product.entity.ProductSpu;
import com.guli.product.mapper.ProductSpuMapper;
import com.guli.product.service.ProductSpuService;
import org.springframework.stereotype.Service;

/**
 * ProductSpuService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class ProductSpuServiceImpl extends ExampleSupportServiceImpl<ProductSpu> implements ProductSpuService {

	protected ProductSpuServiceImpl(ProductSpuMapper mapper) {
		super(mapper);
	}
}
