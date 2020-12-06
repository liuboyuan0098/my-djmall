package com.qz.djmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.product.dao.PmsSkuAttrValueDao;
import com.qz.djmall.product.entity.PmsSkuAttrValueEntity;
import com.qz.djmall.product.service.PmsSkuAttrValueService;


@Service("pmsSkuAttrValueService")
public class PmsSkuAttrValueServiceImpl extends ServiceImpl<PmsSkuAttrValueDao, PmsSkuAttrValueEntity> implements PmsSkuAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuAttrValueEntity> page = this.page(
                new Query<PmsSkuAttrValueEntity>().getPage(params),
                new QueryWrapper<PmsSkuAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}