package com.guli.marketing.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.marketing.entity.CouponBatch;
import com.guli.marketing.mapper.CouponBatchMapper;
import com.guli.marketing.service.CouponBatchService;
import org.springframework.stereotype.Service;

/**
 * CouponBatchServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class CouponBatchServiceImpl extends ExampleSupportServiceImpl<CouponBatch> implements CouponBatchService {

	public CouponBatchServiceImpl(CouponBatchMapper mapper) {
		super(mapper);
	}
}
