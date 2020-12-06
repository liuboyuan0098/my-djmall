package com.qz.djmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.product.dao.PmsSkuDao;
import com.qz.djmall.product.entity.PmsSkuEntity;
import com.qz.djmall.product.service.PmsSkuService;


@Service("pmsSkuService")
public class PmsSkuServiceImpl extends ServiceImpl<PmsSkuDao, PmsSkuEntity> implements PmsSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuEntity> page = this.page(
                new Query<PmsSkuEntity>().getPage(params),
                new QueryWrapper<PmsSkuEntity>()
        );

        return new PageUtils(page);
    }

}