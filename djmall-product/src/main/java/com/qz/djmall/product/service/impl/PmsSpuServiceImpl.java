package com.qz.djmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.product.dao.PmsSpuDao;
import com.qz.djmall.product.entity.PmsSpuEntity;
import com.qz.djmall.product.service.PmsSpuService;


@Service("pmsSpuService")
public class PmsSpuServiceImpl extends ServiceImpl<PmsSpuDao, PmsSpuEntity> implements PmsSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuEntity> page = this.page(
                new Query<PmsSpuEntity>().getPage(params),
                new QueryWrapper<PmsSpuEntity>()
        );

        return new PageUtils(page);
    }

}