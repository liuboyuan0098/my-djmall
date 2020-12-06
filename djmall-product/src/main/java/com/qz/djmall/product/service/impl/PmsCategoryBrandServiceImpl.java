package com.qz.djmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.product.dao.PmsCategoryBrandDao;
import com.qz.djmall.product.entity.PmsCategoryBrandEntity;
import com.qz.djmall.product.service.PmsCategoryBrandService;


@Service("pmsCategoryBrandService")
public class PmsCategoryBrandServiceImpl extends ServiceImpl<PmsCategoryBrandDao, PmsCategoryBrandEntity> implements PmsCategoryBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategoryBrandEntity> page = this.page(
                new Query<PmsCategoryBrandEntity>().getPage(params),
                new QueryWrapper<PmsCategoryBrandEntity>()
        );

        return new PageUtils(page);
    }

}