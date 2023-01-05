package com.guli.product.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.product.entity.AttrOptionalValue;
import com.guli.product.mapper.AttrOptionalValueMapper;
import com.guli.product.service.AttrOptionalValueService;
import org.springframework.stereotype.Service;

/**
 * AttrOptionalValueService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class AttrOptionalValueServiceImpl extends ExampleSupportServiceImpl<AttrOptionalValue> implements AttrOptionalValueService {

	protected AttrOptionalValueServiceImpl(AttrOptionalValueMapper mapper) {
		super(mapper);
	}
}
