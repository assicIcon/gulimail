package com.guli.member.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.member.entity.MemberAddress;
import com.guli.member.mapper.MemberAddressMapper;
import com.guli.member.service.MemberAddressService;
import org.springframework.stereotype.Service;

/**
 * MemberAddressServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class MemberAddressServiceImpl extends ExampleSupportServiceImpl<MemberAddress> implements MemberAddressService {

	protected MemberAddressServiceImpl(MemberAddressMapper mapper) {
		super(mapper);
	}
}
