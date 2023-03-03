package com.guli.order.service.impl;

import com.common.service.impl.ServiceImpl;
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
public class OrderLogisticsServiceImpl extends ServiceImpl<OrderLogistics> implements OrderLogisticsService {

	protected OrderLogisticsServiceImpl(OrderLogisticsMapper mapper) {
		super(mapper);
	}
}
