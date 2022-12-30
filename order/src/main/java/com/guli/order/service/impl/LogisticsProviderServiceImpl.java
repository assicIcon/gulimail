package com.guli.order.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.order.entity.LogisticsProvider;
import com.guli.order.mapper.LogisticsProviderMapper;
import com.guli.order.service.LogisticsProviderService;
import org.springframework.stereotype.Service;

/**
 * LogisticsProviderService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class LogisticsProviderServiceImpl extends ExampleSupportServiceImpl<LogisticsProvider> implements LogisticsProviderService {

	protected LogisticsProviderServiceImpl(LogisticsProviderMapper mapper) {
		super(mapper);
	}
}
