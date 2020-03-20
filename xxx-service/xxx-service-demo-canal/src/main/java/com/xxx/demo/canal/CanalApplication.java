package com.xxx.demo.canal;

import com.xpand.starter.canal.annotation.EnableCanalClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author 张咪
 * @history 2020/3/3 新建
 * @since JDK1.7
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableCanalClient
@Slf4j
public class CanalApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanalApplication.class, args);
        log.info("server started successfully !");
    }
}
