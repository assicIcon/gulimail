package com.guli.marketing.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.marketing.entity.Advertise;
import com.guli.marketing.mapper.AdvertiseMapper;
import com.guli.marketing.service.AdvertiseService;
import org.springframework.stereotype.Service;

/**
 * AdvertiseServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class AdvertiseServiceImpl extends ServiceImpl<Advertise> implements AdvertiseService {

	public AdvertiseServiceImpl(AdvertiseMapper mapper) {
		super(mapper);
	}

}
