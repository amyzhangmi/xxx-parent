package com.xxx.web.demo.remote;

import com.xxx.demo.handler.BrandHandler;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "xxx-service-demo")
public interface BrandFeign extends BrandHandler {

}
