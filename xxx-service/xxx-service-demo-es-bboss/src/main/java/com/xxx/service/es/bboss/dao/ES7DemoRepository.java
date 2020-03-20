package com.xxx.service.es.bboss.dao;

import com.xxx.service.bboss.model.bo.EsDemo7Bo;
import org.frameworkset.elasticsearch.ElasticSearchException;
import org.frameworkset.elasticsearch.boot.BBossESStarter;
import org.frameworkset.elasticsearch.client.ClientInterface;
import org.frameworkset.elasticsearch.client.ClientOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 张咪
 * @history 2019/12/29 新建
 * @since JDK1.7
 */
@Repository
public class ES7DemoRepository {

    private final String ES_MAPPER = "esmapper/esdemo7.xml";

    @Autowired
    private BBossESStarter bbossESStarter;


    /**
     * 创建索引
     */
    public boolean createIndex(String indexName) {
        //创建加载配置文件的客户端工具，单实例多线程安全
        ClientInterface clientUtil = getClient();
        try {
            //判读索引表demo是否存在，存在返回true，不存在返回false
            boolean exist = clientUtil.existIndice(indexName);
            if (exist) {
                return true;
            }
            //创建索引
            clientUtil.createIndiceMapping(indexName,//索引表名称
                    "createDemoIndice");//索引表mapping dsl脚本名称，在esmapper/demo.xml中定义createDemoIndice
        } catch (ElasticSearchException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     * 删除索引
     */
    public boolean dropIndex(String indexName) {
        //创建加载配置文件的客户端工具，单实例多线程安全
        ClientInterface clientUtil = getClient();
        try {
            boolean exist = clientUtil.existIndice(indexName);
            if (exist) {
                clientUtil.dropIndice(indexName);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void batchAddDocument(List<EsDemo7Bo> bos) {
        long start = System.currentTimeMillis();
        ClientInterface clientUtil = getClient();
        //批量添加或者修改2万个文档，将两个对象添加到索引表demo中，批量添加2万条记录耗时1.8s，
        ClientOptions clientOptions = new ClientOptions();
//        clientOptions.setRefreshOption("refresh=true");
        clientOptions.setIdField("id");
        String response = clientUtil.addDocuments(
                bos, clientOptions);//为了测试效果,启用强制刷新机制，实际线上环境去掉最后一个参数"refresh=true"
        long end = System.currentTimeMillis();
        System.out.println("BulkAdd 20002 Documents elapsed:" + (end - start) + "毫秒");
    }


    private ClientInterface getClient() {
        //创建加载配置文件的客户端工具，单实例多线程安全
        ClientInterface clientUtil = bbossESStarter.getConfigRestClient(ES_MAPPER);
        return clientUtil;
    }
}
