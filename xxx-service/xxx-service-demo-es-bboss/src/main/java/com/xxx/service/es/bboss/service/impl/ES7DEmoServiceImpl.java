package com.xxx.service.es.bboss.service.impl;

import com.xxx.framework.common.entity.Result;
import com.xxx.service.bboss.model.bo.EsDemo7Bo;
import com.xxx.service.bboss.service.ES7DemoService;
import com.xxx.service.es.bboss.dao.ES7DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张咪
 * @history 2020/3/20 新建
 * @since JDK1.7
 */
@Service
public class ES7DEmoServiceImpl implements ES7DemoService {

    @Autowired
    ES7DemoRepository es7DemoRepository;

    @Override
    public Result createIndex(String indexName) {
        boolean result = es7DemoRepository.createIndex(indexName);
        return Result.success(result);
    }

    @Override
    public Result dropIndex(String indexName) {
        boolean result = es7DemoRepository.dropIndex(indexName);
        return Result.success(result);
    }

    @Override
    public Result batchAddDocument(List<EsDemo7Bo> bos) {
        es7DemoRepository.batchAddDocument(bos);
        return Result.success();
    }
}
