package com.xxx.demo.redis;

import com.xxx.framework.redis.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 张咪
 * @history 2020/3/20 新建
 * @since JDK1.7
 */
@Slf4j
public class DemoRedisTest extends BaseTestCase {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void test(){
        redisUtil.set("test111", 111);
        redisUtil.set("test222", 111);
        redisUtil.set("test333", 111);
        redisUtil.set("test444", 111);
        redisUtil.set("test555", 111);
        redisUtil.set("test666", 111);
        redisUtil.set("test777", 111);
        redisUtil.set("test888", 111);
    }

    @Test
    public void test2(){
        System.out.println(redisUtil.get("test111"));
        System.out.println(redisUtil.get("test333"));
        System.out.println(redisUtil.get("test555"));
        System.out.println(redisUtil.get("test888"));
    }
}
