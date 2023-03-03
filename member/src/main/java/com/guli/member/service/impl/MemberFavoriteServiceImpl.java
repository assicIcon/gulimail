package com.guli.member.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.member.entity.MemberFavorite;
import com.guli.member.mapper.MemberFavoriteMapper;
import com.guli.member.service.MemberFavoriteService;
import org.springframework.stereotype.Service;

/**
 * MemberFavoriteServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class MemberFavoriteServiceImpl extends ServiceImpl<MemberFavorite> implements MemberFavoriteService {

	protected MemberFavoriteServiceImpl(MemberFavoriteMapper mapper) {
		super(mapper);
	}
}
