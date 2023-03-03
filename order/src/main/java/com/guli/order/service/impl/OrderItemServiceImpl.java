package com.guli.order.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.order.entity.OrderItem;
import com.guli.order.mapper.OrderItemMapper;
import com.guli.order.service.OrderItemService;
import org.springframework.stereotype.Service;

/**
 * OrderItem
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItem> implements OrderItemService {

	protected OrderItemServiceImpl(OrderItemMapper mapper) {
		super(mapper);
	}
}
