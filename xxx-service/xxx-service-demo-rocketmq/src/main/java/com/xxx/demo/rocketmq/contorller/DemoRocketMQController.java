package com.xxx.demo.rocketmq.contorller;

import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.rocketmq.handler.DemoRocketMQHandler;
import com.xxx.demo.rocketmq.producer.Demo01Producer;
import com.xxx.framework.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张咪
 * @history 2020/3/21 新建
 * @since JDK1.7
 */
@Slf4j
@RestController
public class DemoRocketMQController implements DemoRocketMQHandler {

    @Autowired
    private Demo01Producer demo01Producer;


    @Override
    public Result syncSend(Integer id) {
        SendResult sendResult = demo01Producer.syncSend(id);
        log.info("send successfully : {}" , JSONObject.toJSONString(sendResult));
        return Result.success(sendResult);
    }
}
