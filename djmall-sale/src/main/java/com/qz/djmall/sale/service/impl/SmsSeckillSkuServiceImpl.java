package com.qz.djmall.sale.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.sale.dao.SmsSeckillSkuDao;
import com.qz.djmall.sale.entity.SmsSeckillSkuEntity;
import com.qz.djmall.sale.service.SmsSeckillSkuService;


@Service("smsSeckillSkuService")
public class SmsSeckillSkuServiceImpl extends ServiceImpl<SmsSeckillSkuDao, SmsSeckillSkuEntity> implements SmsSeckillSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSeckillSkuEntity> page = this.page(
                new Query<SmsSeckillSkuEntity>().getPage(params),
                new QueryWrapper<SmsSeckillSkuEntity>()
        );

        return new PageUtils(page);
    }

}