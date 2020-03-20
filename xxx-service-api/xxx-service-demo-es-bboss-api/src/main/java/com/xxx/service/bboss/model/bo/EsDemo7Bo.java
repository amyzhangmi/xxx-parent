package com.xxx.service.bboss.model.bo;

import com.frameworkset.orm.annotation.ESId;
import com.frameworkset.orm.annotation.ESIndex;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 张咪
 * @history 2019/12/29 新建
 * @since JDK1.7
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ESIndex(name="demowithesindex-{dateformat=yyyy.MM.dd}")
@ESIndex(name="demo")
public class EsDemo7Bo {

    /**
     * 主键ID
     */
    @ESId(readSet = true,persistent = false)
    private long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 编码
     */
    private Integer code;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
