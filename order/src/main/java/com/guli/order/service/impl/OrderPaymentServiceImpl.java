package com.guli.order.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.order.entity.OrderPayment;
import com.guli.order.mapper.OrderPaymentMapper;
import com.guli.order.service.OrderPaymentService;
import org.springframework.stereotype.Service;

/**
 * OrderPaymentService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class OrderPaymentServiceImpl extends ServiceImpl<OrderPayment> implements OrderPaymentService {

	protected OrderPaymentServiceImpl(OrderPaymentMapper mapper) {
		super(mapper);
	}
}
