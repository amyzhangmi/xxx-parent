package com.xxx.demo.gateway.resolver;

import org.springframework.cloud.gateway.filter.ratelimit.PrincipalNameKeyResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author 张咪
 * @history 2020/3/21 新建
 * @since JDK1.7
 */
@Component
public class IpKeyResolver extends PrincipalNameKeyResolver {

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
