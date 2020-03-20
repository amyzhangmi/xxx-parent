package com.xxx.service.es.bboss;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 张咪
 * @history 2020/3/19 新建
 * @since JDK1.7
 */
@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class ESDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ESDemoApplication.class, args);
        log.info("the server started successfully !");
    }
}
