package com.guli.product.service.impl;

import com.common.service.ExampleSupportService;
import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.product.entity.ProductSpuImage;
import com.guli.product.mapper.ProductSpuImageMapper;
import com.guli.product.service.ProductSpuImageService;
import org.springframework.stereotype.Service;

/**
 * ProductSpuImageService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class ProductSpuImageServiceImpl extends ExampleSupportServiceImpl<ProductSpuImage> implements ProductSpuImageService {

	protected ProductSpuImageServiceImpl(ProductSpuImageMapper mapper) {
		super(mapper);
	}
}
