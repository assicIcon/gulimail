package com.guli.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * PmsApplication
 *
 * @author Runhu-Wu
 * @date 2022/12/12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsApplication.class, args);
	}

}
