package com.xxx.demo;

import com.alibaba.fastjson.JSONObject;
import com.xxx.BaseTestCase;
import com.xxx.demo.dto.BrandDto;
import com.xxx.demo.service.BrandService;
import com.xxx.framework.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 张咪
 * @history 2020/3/17 新建
 * @since JDK1.7
 */
@Slf4j
public class BrandTest extends BaseTestCase {

    @Autowired
    BrandService brandService;

    @Test
    public void testAdd(){
        BrandDto dto = new BrandDto();
        dto.setName("杀马特");
        dto.setLetter("S");
        dto.setSeq(1);
        Result result = brandService.insert(dto);
      log.info("result------------>{}",JSONObject.toJSONString(result));
    }
}
