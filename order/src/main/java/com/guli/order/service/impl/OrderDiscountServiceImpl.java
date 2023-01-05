package com.guli.order.service.impl;

import com.common.service.ExampleSupportService;
import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.order.entity.OrderDiscount;
import com.guli.order.mapper.OrderDiscountMapper;
import com.guli.order.service.OrderDiscountService;
import org.springframework.stereotype.Service;

/**
 * OrderDiscountService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class OrderDiscountServiceImpl extends ExampleSupportServiceImpl<OrderDiscount> implements OrderDiscountService {

	protected OrderDiscountServiceImpl(OrderDiscountMapper mapper) {
		super(mapper);
	}
}
