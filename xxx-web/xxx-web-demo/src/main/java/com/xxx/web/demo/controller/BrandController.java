package com.xxx.web.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.dto.BrandDto;
import com.xxx.framework.common.base.BaseController;
import com.xxx.framework.common.entity.Result;
import com.xxx.web.demo.remote.BrandFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张咪
 * @history 2020/3/18 新建
 * @since JDK1.7
 */
@RestController
@Slf4j
@RequestMapping("/brand/")
public class BrandController extends BaseController {

    @Autowired
    private BrandFeign brandFeign;

    @RequestMapping("/test")
    public Result test(){
        BrandDto dto = new BrandDto();
        Result result = brandFeign.list(dto);
      log.info("result--------->"+ JSONObject.toJSONString(result));
      return result;
    }
}
