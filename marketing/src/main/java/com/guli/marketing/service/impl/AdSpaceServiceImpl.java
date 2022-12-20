package com.guli.marketing.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.marketing.entity.AdSpace;
import com.guli.marketing.mapper.AdSpaceMapper;
import com.guli.marketing.service.AdSpaceService;
import org.springframework.stereotype.Service;

/**
 * AdSpaceServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class AdSpaceServiceImpl extends ExampleSupportServiceImpl<AdSpace> implements AdSpaceService {

	public AdSpaceServiceImpl(AdSpaceMapper mapper) {
		super(mapper);
	}

}
