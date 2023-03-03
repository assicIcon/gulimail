package com.guli.user.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.user.entity.MenuFunction;
import com.guli.user.mapper.MenuFunctionMapper;
import com.guli.user.service.MenuFunctionService;
import org.springframework.stereotype.Service;

/**
 * MenuFunction
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class MenuFunctionServiceImpl extends ServiceImpl<MenuFunction> implements MenuFunctionService {

	public MenuFunctionServiceImpl(MenuFunctionMapper mapper) {
		super(mapper);
	}
}
