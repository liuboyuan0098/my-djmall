package com.qz.djmall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.user.dao.UmsUserCollectSkuDao;
import com.qz.djmall.user.entity.UmsUserCollectSkuEntity;
import com.qz.djmall.user.service.UmsUserCollectSkuService;


@Service("umsUserCollectSkuService")
public class UmsUserCollectSkuServiceImpl extends ServiceImpl<UmsUserCollectSkuDao, UmsUserCollectSkuEntity> implements UmsUserCollectSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsUserCollectSkuEntity> page = this.page(
                new Query<UmsUserCollectSkuEntity>().getPage(params),
                new QueryWrapper<UmsUserCollectSkuEntity>()
        );

        return new PageUtils(page);
    }

}