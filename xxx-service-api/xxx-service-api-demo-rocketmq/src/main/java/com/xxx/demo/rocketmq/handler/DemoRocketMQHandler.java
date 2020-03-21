package com.xxx.demo.rocketmq.handler;

import com.xxx.framework.common.entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/demo/rocketmq")
public interface DemoRocketMQHandler {

    @RequestMapping("/syncSend")
    Result syncSend(Integer id);
}
