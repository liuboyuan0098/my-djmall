package com.qz.djmall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.user.dao.UmsUserLevelDao;
import com.qz.djmall.user.entity.UmsUserLevelEntity;
import com.qz.djmall.user.service.UmsUserLevelService;


@Service("umsUserLevelService")
public class UmsUserLevelServiceImpl extends ServiceImpl<UmsUserLevelDao, UmsUserLevelEntity> implements UmsUserLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsUserLevelEntity> page = this.page(
                new Query<UmsUserLevelEntity>().getPage(params),
                new QueryWrapper<UmsUserLevelEntity>()
        );

        return new PageUtils(page);
    }

}