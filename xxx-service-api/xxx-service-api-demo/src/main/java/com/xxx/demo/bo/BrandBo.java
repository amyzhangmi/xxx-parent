package com.xxx.demo.bo;

import com.xxx.framework.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "brand")
public class BrandBo extends BaseEntity implements Serializable {
    @Id
    private Long id;//品牌id
    private String name;//品牌名称
    private String image;//品牌图片地址
    private String letter;//品牌的首字母
    private Integer seq;//排序
}
