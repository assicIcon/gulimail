package com.guli.order.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.order.entity.LogisticsProviderContact;
import com.guli.order.mapper.LogisticsProviderContactMapper;
import com.guli.order.service.LogisticsProviderContactService;
import org.springframework.stereotype.Service;

/**
 * LogisticsProviderContactServiceImpl
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class LogisticsProviderContactServiceImpl extends ExampleSupportServiceImpl<LogisticsProviderContact> implements LogisticsProviderContactService {

	public LogisticsProviderContactServiceImpl(LogisticsProviderContactMapper mapper) {
		super(mapper);
	}
}
