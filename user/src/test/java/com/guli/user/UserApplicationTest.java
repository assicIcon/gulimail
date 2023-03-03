package com.guli.user;

import com.guli.user.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * UserApplicationTest
 *
 * @author Runhu-Wu
 * @date 2023/2/7
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserApplicationTest {

	@Resource
	private UserMapper userMapper;

	@Test
	public void testUserMapper() {
		System.out.println(userMapper.selectAll());
	}

}
