package com.guli.order.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.order.entity.OrderItemDiscount;
import com.guli.order.mapper.OrderItemDiscountMapper;
import com.guli.order.service.OrderItemDiscountService;
import org.springframework.stereotype.Service;

/**
 * OrderItemDiscountService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class OrderItemDiscountServiceImpl extends ServiceImpl<OrderItemDiscount> implements OrderItemDiscountService {

	protected OrderItemDiscountServiceImpl(OrderItemDiscountMapper mapper) {
		super(mapper);
	}
}
