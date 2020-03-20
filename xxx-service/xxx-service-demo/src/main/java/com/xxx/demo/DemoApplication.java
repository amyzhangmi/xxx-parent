package com.xxx.demo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 张咪
 * @history 2020/3/17 新建
 * @since JDK1.7
 */
@SpringBootApplication
@MapperScan(basePackages="com.xxx.demo.mapper")
@EnableEurekaClient
@EnableApolloConfig
@Slf4j
public class DemoApplication {

    public static void main(String[] args) {
//        System.setProperty("env","DEV");
        SpringApplication.run(DemoApplication.class,args);
        log.info("the server started successfully !");
    }
}
