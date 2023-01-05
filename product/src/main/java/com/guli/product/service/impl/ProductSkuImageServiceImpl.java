package com.guli.product.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.product.entity.ProductSkuImage;
import com.guli.product.mapper.ProductSkuImageMapper;
import com.guli.product.service.ProductSkuImageService;
import org.springframework.stereotype.Service;

/**
 * ProductSkuImageService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class ProductSkuImageServiceImpl extends ExampleSupportServiceImpl<ProductSkuImage> implements ProductSkuImageService {

	protected ProductSkuImageServiceImpl(ProductSkuImageMapper mapper) {
		super(mapper);
	}
}
