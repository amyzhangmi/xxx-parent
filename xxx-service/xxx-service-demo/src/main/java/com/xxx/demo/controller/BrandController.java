package com.xxx.demo.controller;

import com.xxx.demo.dto.BrandDto;
import com.xxx.demo.handler.BrandHandler;
import com.xxx.demo.service.BrandService;
import com.xxx.framework.common.base.BaseController;
import com.xxx.framework.common.dto.QueryByIdDto;
import com.xxx.framework.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张咪
 * @history 2020/3/17 新建
 * @since JDK1.7
 */
@RestController
public class BrandController extends BaseController implements BrandHandler {

    @Autowired
    BrandService brandService;

    @Override
    public Result add(@RequestBody BrandDto dto){
        if(null != dto.getId() && dto.getId() > 0){
            return brandService.update(dto);
        }else {
            return brandService.insert(dto);
        }
    }

    @Override
    public Result list(@RequestBody BrandDto dto){
        return brandService.findPage(dto);
    }

    @Override
    public Result get(@RequestBody QueryByIdDto dto){
        return brandService.findById(dto.getId());
    }

    @Override
    public Result del(@RequestBody QueryByIdDto dto){
        return brandService.delete(dto.getId());
    }
}
