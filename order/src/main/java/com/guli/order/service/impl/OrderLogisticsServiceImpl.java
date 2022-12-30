package com.guli.order.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.order.entity.OrderLogistics;
import com.guli.order.mapper.OrderLogisticsMapper;
import com.guli.order.service.OrderLogisticsService;
import org.springframework.stereotype.Service;

/**
 * OrderLogisticsService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class OrderLogisticsServiceImpl extends ExampleSupportServiceImpl<OrderLogistics> implements OrderLogisticsService {

	protected OrderLogisticsServiceImpl(OrderLogisticsMapper mapper) {
		super(mapper);
	}
}
