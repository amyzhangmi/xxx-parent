package com.xxx.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xxx.demo.bo.BrandBo;
import com.xxx.demo.dto.BrandDto;
import com.xxx.demo.mapper.BrandMapper;
import com.xxx.demo.service.BrandService;
import com.xxx.framework.common.entity.Page;
import com.xxx.framework.common.entity.Result;
import com.xxx.framework.common.enuns.StatuEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @author 张咪
 * @history 2020/3/2 新建
 * @since JDK1.7
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Result insert(BrandDto dto) {
        BrandBo bo = new BrandBo();
        BeanUtils.copyProperties(dto, bo);
        int count = brandMapper.insertSelective(bo);
        return Result.success(count);
    }

    @Override
    public Result update(BrandDto dto) {
        BrandBo bo = new BrandBo();
        BeanUtils.copyProperties(dto, bo);
        int count = brandMapper.updateByPrimaryKeySelective(bo);
        return Result.success(count);
    }

    @Override
    public Result findById(Long id) {
        BrandBo bo = brandMapper.selectByPrimaryKey(id);
        return Result.success(bo);
    }

    @Override
    public Result findPage(BrandDto dto) {
        PageHelper.startPage(dto.getPageNow(), dto.getPageSize());
        Example example = createExample(dto);
        PageInfo<BrandBo> pageInfo = new PageInfo<>(brandMapper.selectByExample(example));
        Page page = new Page(dto.getPageNow(), dto.getPageSize(), pageInfo.getTotal(), pageInfo.getList());
        return Result.success(page);
    }

    @Override
    public Result delete(Long id) {
        BrandBo bo = new BrandBo();
        bo.setId(id);
        bo.setIsDeleted(StatuEnum.IS_DELETED.value);
        int count = brandMapper.updateByPrimaryKeySelective(bo);
        return Result.success(count);
    }

    /**
     * 构建查询对象
     */
    public Example createExample(BrandDto dto) {
        Example example = new Example(BrandBo.class);
        Example.Criteria criteria = example.createCriteria();
        if (dto != null) {
            // 品牌名称
            if (!StringUtils.isEmpty(dto.getName())) {
                criteria.andLike("name", "%" + dto.getName() + "%");
            }
            // 品牌图片地址
            if (!StringUtils.isEmpty(dto.getImage())) {
                criteria.andLike("image", "%" + dto.getImage() + "%");
            }
            // 品牌的首字母
            if (!StringUtils.isEmpty(dto.getLetter())) {
                criteria.andLike("letter", "%" + dto.getLetter() + "%");
            }
            // 品牌id
            if (null != dto.getId()) {
                criteria.andEqualTo("id", dto.getId());
            }
            // 排序
            if (null != dto.getSeq()) {
                criteria.andEqualTo("seq", dto.getSeq());
            }
        }
        return example;
    }
}
