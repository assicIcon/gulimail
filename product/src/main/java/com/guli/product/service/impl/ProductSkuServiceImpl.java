package com.guli.product.service.impl;

import com.common.service.ExampleSupportService;
import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.product.entity.ProductSku;
import com.guli.product.mapper.ProductSkuMapper;
import com.guli.product.service.ProductSkuService;
import org.springframework.stereotype.Service;

/**
 * ProductSkuService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class ProductSkuServiceImpl extends ExampleSupportServiceImpl<ProductSku> implements ProductSkuService {

	protected ProductSkuServiceImpl(ProductSkuMapper mapper) {
		super(mapper);
	}
}
