package com.guli.marketing.controller;

import com.guli.marketing.service.impl.CouponServiceImpl;
import org.junit.Test;

import java.lang.reflect.ParameterizedType;

/**
 * BaseControllerTest
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
public class BaseControllerTest {

	@Test
	public void getEntityClassTest() {
		System.out.println(((ParameterizedType) CouponServiceImpl.class.getGenericSuperclass()).getActualTypeArguments()[0]);
	}

}
