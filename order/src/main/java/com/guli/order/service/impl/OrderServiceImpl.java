package com.guli.order.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.order.entity.Order;
import com.guli.order.mapper.OrderMapper;
import com.guli.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * OrderService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class OrderServiceImpl extends ServiceImpl<Order> implements OrderService {

	protected OrderServiceImpl(OrderMapper mapper) {
		super(mapper);
	}
}
