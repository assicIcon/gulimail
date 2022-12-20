package com.guli.marketing.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.marketing.entity.Coupon;
import com.guli.marketing.mapper.CouponMapper;
import com.guli.marketing.service.CouponService;
import org.springframework.stereotype.Service;

/**
 * CouponServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class CouponServiceImpl extends ExampleSupportServiceImpl<Coupon> implements CouponService {

	public CouponServiceImpl(CouponMapper mapper) {
		super(mapper);
	}
}
