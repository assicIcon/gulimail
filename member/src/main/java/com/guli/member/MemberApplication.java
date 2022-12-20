package com.guli.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * MmsApplication
 *
 * @author Runhu-Wu
 * @date 2022/12/13
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.guli.member.mapper")
public class MemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberApplication.class, args);
	}

}
