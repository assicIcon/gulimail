package com.guli.user.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
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
public class MenuFunctionServiceImpl extends ExampleSupportServiceImpl<MenuFunction> implements MenuFunctionService {

	public MenuFunctionServiceImpl(MenuFunctionMapper mapper) {
		super(mapper);
	}
}
