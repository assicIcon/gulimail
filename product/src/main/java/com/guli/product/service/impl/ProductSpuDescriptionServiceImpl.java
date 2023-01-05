package com.guli.product.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.product.entity.ProductSpuDescription;
import com.guli.product.mapper.ProductSpuDescriptionMapper;
import com.guli.product.service.ProductSpuDescriptionService;
import org.springframework.stereotype.Service;

/**
 * ProductSpuDescriptionService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class ProductSpuDescriptionServiceImpl extends ExampleSupportServiceImpl<ProductSpuDescription> implements ProductSpuDescriptionService {

	protected ProductSpuDescriptionServiceImpl(ProductSpuDescriptionMapper mapper) {
		super(mapper);
	}
}
