package com.qz.djmall.sale.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.sale.dao.SmsCouponSpuDao;
import com.qz.djmall.sale.entity.SmsCouponSpuEntity;
import com.qz.djmall.sale.service.SmsCouponSpuService;


@Service("smsCouponSpuService")
public class SmsCouponSpuServiceImpl extends ServiceImpl<SmsCouponSpuDao, SmsCouponSpuEntity> implements SmsCouponSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponSpuEntity> page = this.page(
                new Query<SmsCouponSpuEntity>().getPage(params),
                new QueryWrapper<SmsCouponSpuEntity>()
        );

        return new PageUtils(page);
    }

}