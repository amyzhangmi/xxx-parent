package com.xxx.demo.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.InetSocketAddress;

/**
 * @author 张咪
 * @history 2020/3/21 新建
 * @since JDK1.7
 */
@Component
@Slf4j
public class IpFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        log.info("经过第1个过滤器IpFilter");
        ServerHttpRequest request = exchange.getRequest();
        InetSocketAddress remoteAddress = request.getRemoteAddress();
        log.info("ip:"+remoteAddress.getHostName());
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
