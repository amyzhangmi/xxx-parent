package com.xxx.demo.dto;

import com.xxx.framework.common.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 张咪
 * @history 2020/3/2 新建
 * @since JDK1.7
 */
@Getter
@Setter
public class BrandDto extends BaseDto {

    private Long id;//品牌id
    private String name;//品牌名称
    private String image;//品牌图片地址
    private String letter;//品牌的首字母
    private Integer seq;//排序
}
