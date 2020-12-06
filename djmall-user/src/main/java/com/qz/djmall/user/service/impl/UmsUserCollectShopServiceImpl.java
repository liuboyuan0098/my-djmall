package com.qz.djmall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.user.dao.UmsUserCollectShopDao;
import com.qz.djmall.user.entity.UmsUserCollectShopEntity;
import com.qz.djmall.user.service.UmsUserCollectShopService;


@Service("umsUserCollectShopService")
public class UmsUserCollectShopServiceImpl extends ServiceImpl<UmsUserCollectShopDao, UmsUserCollectShopEntity> implements UmsUserCollectShopService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsUserCollectShopEntity> page = this.page(
                new Query<UmsUserCollectShopEntity>().getPage(params),
                new QueryWrapper<UmsUserCollectShopEntity>()
        );

        return new PageUtils(page);
    }

}