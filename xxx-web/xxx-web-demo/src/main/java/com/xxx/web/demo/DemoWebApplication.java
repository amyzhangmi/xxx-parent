package com.xxx.web.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 张咪
 * @history 2020/3/18 新建
 * @since JDK1.7
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Slf4j
public class DemoWebApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class,args);
        log.info("the server started successfully !");
    }
}
