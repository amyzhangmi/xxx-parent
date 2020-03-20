package com.xxx.service.es.bboss.controller;

import com.xxx.framework.common.base.BaseController;
import com.xxx.framework.common.entity.Result;
import com.xxx.service.bboss.handler.ES7DemoHandler;
import com.xxx.service.bboss.model.bo.EsDemo7Bo;
import com.xxx.service.bboss.service.ES7DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张咪
 * @history 2020/3/20 新建
 * @since JDK1.7
 */
@RestController
public class ES7DemoController extends BaseController implements ES7DemoHandler {

    @Autowired
    private ES7DemoService es7DemoService;

    @Override
    public Result createDemoIndex() {
        return es7DemoService.createIndex("demo");
    }

    @Override
    public Result dropDemoIndex() {
        return es7DemoService.dropIndex("demo");
    }

    @Override
    public Result batchAddDocument(@RequestBody List<EsDemo7Bo> bos) {
        return es7DemoService.batchAddDocument(bos);
    }
}
