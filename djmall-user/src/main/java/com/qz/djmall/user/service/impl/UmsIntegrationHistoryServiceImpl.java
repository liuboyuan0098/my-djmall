package com.qz.djmall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.user.dao.UmsIntegrationHistoryDao;
import com.qz.djmall.user.entity.UmsIntegrationHistoryEntity;
import com.qz.djmall.user.service.UmsIntegrationHistoryService;


@Service("umsIntegrationHistoryService")
public class UmsIntegrationHistoryServiceImpl extends ServiceImpl<UmsIntegrationHistoryDao, UmsIntegrationHistoryEntity> implements UmsIntegrationHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsIntegrationHistoryEntity> page = this.page(
                new Query<UmsIntegrationHistoryEntity>().getPage(params),
                new QueryWrapper<UmsIntegrationHistoryEntity>()
        );

        return new PageUtils(page);
    }

}