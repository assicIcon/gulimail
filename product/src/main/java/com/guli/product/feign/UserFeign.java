package com.guli.product.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * UserFeign
 *
 * @author Runhu-Wu
 * @date 2023/1/9
 */
@FeignClient("mall-user")
@RequestMapping("/user")
public interface UserFeign {

}
