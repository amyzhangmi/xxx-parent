package com.xxx.service.bboss.service;

import com.xxx.framework.common.entity.Result;
import com.xxx.service.bboss.model.bo.EsDemo7Bo;

import java.util.List;

public interface ES7DemoService {

    Result createIndex(String indexName);

    Result dropIndex(String indexName);

    Result batchAddDocument(List<EsDemo7Bo> bos);
}
