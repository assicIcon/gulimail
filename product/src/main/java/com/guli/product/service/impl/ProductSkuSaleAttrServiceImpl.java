package com.guli.product.service.impl;

import com.common.service.ExampleSupportService;
import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.product.entity.ProductSkuSaleAttr;
import com.guli.product.mapper.ProductSkuSaleAttrMapper;
import com.guli.product.service.ProductSkuSaleAttrService;
import org.springframework.stereotype.Service;

/**
 * ProductSkuSaleAttrService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class ProductSkuSaleAttrServiceImpl extends ExampleSupportServiceImpl<ProductSkuSaleAttr> implements ProductSkuSaleAttrService {

	protected ProductSkuSaleAttrServiceImpl(ProductSkuSaleAttrMapper mapper) {
		super(mapper);
	}
}
