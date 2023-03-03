package com.guli.gateway.exception;

import com.common.core.response.Response;
import com.common.core.response.ResponseBuilder;
import com.common.core.util.JsonUtil;
import org.springframework.boot.web.reactive.error.ErrorWebExceptionHandler;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * GatewayExceptionHandler
 *
 * @author Runhu-Wu
 * @date 2023/1/5
 */
//@Component
public class GatewayExceptionHandler implements ErrorWebExceptionHandler {

	@Override
	public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
		ServerHttpResponse serverHttpResponse = exchange.getResponse();
		Response<Void> response;

		if (ex instanceof ResponseStatusException) {
			response = ResponseBuilder.failure(((ResponseStatusException) ex).getReason());
		} else {
			response = ResponseBuilder.failure(ex.getMessage());
		}

		DataBuffer dataBuffer = serverHttpResponse.bufferFactory()
				.allocateBuffer().write(JsonUtil.toJson(response).getBytes());
		serverHttpResponse.setStatusCode(HttpStatus.OK);
		serverHttpResponse.getHeaders().setContentType(MediaType.APPLICATION_JSON);
		return serverHttpResponse.writeAndFlushWith(Mono.just(Mono.just(dataBuffer)));
	}

}
