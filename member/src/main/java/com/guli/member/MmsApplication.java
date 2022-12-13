package com.guli.member;

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
public class MmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmsApplication.class, args);
	}

}
