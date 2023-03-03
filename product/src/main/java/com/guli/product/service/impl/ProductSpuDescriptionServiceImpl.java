package com.guli.product.service.impl;

import com.common.service.impl.ServiceImpl;
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
public class ProductSpuDescriptionServiceImpl extends ServiceImpl<ProductSpuDescription> implements ProductSpuDescriptionService {

	protected ProductSpuDescriptionServiceImpl(ProductSpuDescriptionMapper mapper) {
		super(mapper);
	}
}
