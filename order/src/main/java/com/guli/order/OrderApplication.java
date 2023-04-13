package com.guli.order;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * OrderApplication
 *
 * @author Runhu-Wu
 * @date 2022/12/16
 */
//@EnableApolloConfig({"datasource", "application", "TEST1.nacos"})
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.guli.order.mapper")
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

}
