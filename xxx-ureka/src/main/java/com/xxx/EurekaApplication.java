package com.xxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 张咪
 * @history 2020/2/29 新建
 * @since JDK1.7
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {


    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
