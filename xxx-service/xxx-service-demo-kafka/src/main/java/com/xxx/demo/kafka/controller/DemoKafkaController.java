package com.xxx.demo.kafka.controller;

import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.kafka.handler.DemoKafkaHandler;
import com.xxx.demo.kafka.producer.DemoProducer;
import com.xxx.framework.common.base.BaseController;
import com.xxx.framework.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * @author 张咪
 * @history 2020/3/24 新建
 * @since JDK1.7
 */
@RestController
@Slf4j
public class DemoKafkaController extends BaseController implements DemoKafkaHandler {

    @Autowired
    private DemoProducer demoProducer;

    @Override
    public Result syncSend(Integer id) throws ExecutionException, InterruptedException {
        SendResult sendResult = demoProducer.syncSend(id);
        return Result.success(JSONObject.toJSONString(sendResult));
    }
}
