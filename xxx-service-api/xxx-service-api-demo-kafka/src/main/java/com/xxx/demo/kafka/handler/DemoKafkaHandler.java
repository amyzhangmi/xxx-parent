package com.xxx.demo.kafka.handler;

import com.xxx.framework.common.entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.ExecutionException;

/**
 * @author 张咪
 * @history 2020/3/24 新建
 * @since JDK1.7
 */
@RequestMapping("/demo/kafka")
public interface DemoKafkaHandler {

    @RequestMapping("/test")
    Result syncSend(Integer id) throws ExecutionException, InterruptedException;
}