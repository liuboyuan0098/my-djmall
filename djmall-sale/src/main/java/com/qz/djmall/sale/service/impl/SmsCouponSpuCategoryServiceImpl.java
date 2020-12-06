package com.qz.djmall.sale.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.sale.dao.SmsCouponSpuCategoryDao;
import com.qz.djmall.sale.entity.SmsCouponSpuCategoryEntity;
import com.qz.djmall.sale.service.SmsCouponSpuCategoryService;


@Service("smsCouponSpuCategoryService")
public class SmsCouponSpuCategoryServiceImpl extends ServiceImpl<SmsCouponSpuCategoryDao, SmsCouponSpuCategoryEntity> implements SmsCouponSpuCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponSpuCategoryEntity> page = this.page(
                new Query<SmsCouponSpuCategoryEntity>().getPage(params),
                new QueryWrapper<SmsCouponSpuCategoryEntity>()
        );

        return new PageUtils(page);
    }

}