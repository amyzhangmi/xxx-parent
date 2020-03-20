package com.xxx.demo.handler;

import com.xxx.demo.dto.BrandDto;
import com.xxx.framework.common.dto.QueryByIdDto;
import com.xxx.framework.common.entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/goods/brand")
public interface BrandHandler {

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(@RequestBody BrandDto dto);

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Result list(@RequestBody BrandDto dto);

    @RequestMapping(value = "/get",method = RequestMethod.POST)
    public Result get(@RequestBody QueryByIdDto dto);

    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Result del(@RequestBody QueryByIdDto dto);
}
