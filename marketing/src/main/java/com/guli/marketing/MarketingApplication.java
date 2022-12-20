package com.guli.marketing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * MarketingApplication
 *
 * @author Runhu-Wu
 * @date 2022/12/14
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.guli.marketing.mapper")
public class MarketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketingApplication.class, args);
	}

}
