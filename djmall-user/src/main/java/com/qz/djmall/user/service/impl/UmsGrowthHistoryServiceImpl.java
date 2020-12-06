package com.qz.djmall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.user.dao.UmsGrowthHistoryDao;
import com.qz.djmall.user.entity.UmsGrowthHistoryEntity;
import com.qz.djmall.user.service.UmsGrowthHistoryService;


@Service("umsGrowthHistoryService")
public class UmsGrowthHistoryServiceImpl extends ServiceImpl<UmsGrowthHistoryDao, UmsGrowthHistoryEntity> implements UmsGrowthHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsGrowthHistoryEntity> page = this.page(
                new Query<UmsGrowthHistoryEntity>().getPage(params),
                new QueryWrapper<UmsGrowthHistoryEntity>()
        );

        return new PageUtils(page);
    }

}