package com.xxx.service.es.bboss;

import com.xxx.service.bboss.model.bo.EsDemo7Bo;
import com.xxx.service.bboss.service.ES7DemoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 张咪
 * @history 2020/3/20 新建
 * @since JDK1.7
 */
public class ES7DemoTest extends BaseTestCase {

    @Autowired
    private ES7DemoService es7DemoService;

    @Test
    public void batchAdd(){
        Date date = new Date();
        List<EsDemo7Bo> bos = new ArrayList<>();
        for(int i=300000;i<300003;i++){
            EsDemo7Bo bo = new EsDemo7Bo();
            bo.setId(i);
            bo.setCode(i);
            bo.setName("对对对"+i);
            bo.setPrice(new BigDecimal(22.22+i));
            bo.setCreateTime(date);
            bo.setUpdateTime(date);
            bo.setType(i%10);
            bos.add(bo);
        }
        es7DemoService.batchAddDocument(bos);
    }
}
