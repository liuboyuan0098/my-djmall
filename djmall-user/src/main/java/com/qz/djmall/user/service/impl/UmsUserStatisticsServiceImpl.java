package com.qz.djmall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.user.dao.UmsUserStatisticsDao;
import com.qz.djmall.user.entity.UmsUserStatisticsEntity;
import com.qz.djmall.user.service.UmsUserStatisticsService;


@Service("umsUserStatisticsService")
public class UmsUserStatisticsServiceImpl extends ServiceImpl<UmsUserStatisticsDao, UmsUserStatisticsEntity> implements UmsUserStatisticsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsUserStatisticsEntity> page = this.page(
                new Query<UmsUserStatisticsEntity>().getPage(params),
                new QueryWrapper<UmsUserStatisticsEntity>()
        );

        return new PageUtils(page);
    }

}