package com.xxx.service.bboss.handler;

import com.xxx.framework.common.entity.Result;
import com.xxx.service.bboss.model.bo.EsDemo7Bo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/es7/demo")
public interface ES7DemoHandler {

    @RequestMapping("/create")
    Result createDemoIndex();

    @RequestMapping("/drop")
    Result dropDemoIndex();

    @RequestMapping(value = "/batchInsert",method = RequestMethod.POST)
    Result batchAddDocument(List<EsDemo7Bo> bos);
}
