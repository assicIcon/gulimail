package com.guli.gateway.filter;

import com.common.util.MDCHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * MDCFilter
 *
 * @author Runhu-Wu
 * @date 2023/1/5
 */
@Slf4j
@Component
public class MDCFilter implements GlobalFilter {

	private static final String HEADER_TRACE_ID = "trace-id";

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		log.info("MDC Filter filter...");
		ServerHttpRequest request = exchange.getRequest();
		String traceId = request.getHeaders().getFirst(HEADER_TRACE_ID);
		if (ObjectUtils.isEmpty(traceId)) {
			traceId = UUID.randomUUID().toString().replace("-", "");
		}
		MDCHelper.setTraceId(traceId);
		return chain.filter(exchange);
	}
}
