package com.guli.marketing.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.marketing.entity.CouponUseCondition;
import com.guli.marketing.mapper.CouponUseConditionMapper;
import com.guli.marketing.service.CouponUseConditionService;
import org.springframework.stereotype.Service;

/**
 * CouponUseConditionServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class CouponUseConditionServiceImpl extends ServiceImpl<CouponUseCondition> implements CouponUseConditionService {

	public CouponUseConditionServiceImpl(CouponUseConditionMapper mapper) {
		super(mapper);
	}

}
