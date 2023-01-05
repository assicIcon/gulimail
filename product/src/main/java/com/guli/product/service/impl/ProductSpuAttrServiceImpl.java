package com.guli.product.service.impl;

import com.common.service.ExampleSupportService;
import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.product.entity.ProductSpuAttr;
import com.guli.product.mapper.ProductSpuAttrMapper;
import com.guli.product.service.ProductSpuAttrService;
import org.springframework.stereotype.Service;

/**
 * ProductSpuAttrService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class ProductSpuAttrServiceImpl extends ExampleSupportServiceImpl<ProductSpuAttr> implements ProductSpuAttrService {

	protected ProductSpuAttrServiceImpl(ProductSpuAttrMapper mapper) {
		super(mapper);
	}
}
