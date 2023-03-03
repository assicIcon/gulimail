package com.guli.order.service.impl;

import com.common.service.impl.ServiceImpl;
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
public class OrderDiscountServiceImpl extends ServiceImpl<OrderDiscount> implements OrderDiscountService {

	protected OrderDiscountServiceImpl(OrderDiscountMapper mapper) {
		super(mapper);
	}
}
