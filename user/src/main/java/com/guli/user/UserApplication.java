package com.guli.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * com.guli.user.UserApplication
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.guli.user.mapper")
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
