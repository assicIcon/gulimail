package com.guli.product.config;

import com.common.response.ResponseHelper;
import com.common.util.IoUtil;
import feign.Feign;
import feign.codec.Decoder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FeignConfig
 *
 * @author Runhu-Wu
 * @date 2023/1/9
 */
@Configuration
@ConditionalOnClass(Feign.class)
public class FeignConfig {

	@Bean
	public Decoder feignDecoder() {
		return (response, type) -> ResponseHelper.buildResponseFromJson(IoUtil.readAsString(response.body().asInputStream()), type);
	}

}
