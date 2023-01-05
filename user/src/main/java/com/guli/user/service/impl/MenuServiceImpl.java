package com.guli.user.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.user.entity.Menu;
import com.guli.user.mapper.MenuMapper;
import com.guli.user.service.MenuService;
import org.springframework.stereotype.Service;

/**
 * Menu
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class MenuServiceImpl extends ExampleSupportServiceImpl<Menu> implements MenuService {

	public MenuServiceImpl(MenuMapper mapper) {
		super(mapper);
	}
}
