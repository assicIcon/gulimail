package com.guli.member.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.member.entity.Level;
import com.guli.member.mapper.LevelMapper;
import com.guli.member.service.LevelService;
import org.springframework.stereotype.Service;

/**
 * LevelServiceImpl
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@Service
public class LevelServiceImpl extends ServiceImpl<Level> implements LevelService {

	protected LevelServiceImpl(LevelMapper mapper) {
		super(mapper);
	}

}
