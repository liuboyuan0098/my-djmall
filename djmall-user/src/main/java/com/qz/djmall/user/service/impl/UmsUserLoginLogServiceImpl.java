package com.qz.djmall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.user.dao.UmsUserLoginLogDao;
import com.qz.djmall.user.entity.UmsUserLoginLogEntity;
import com.qz.djmall.user.service.UmsUserLoginLogService;


@Service("umsUserLoginLogService")
public class UmsUserLoginLogServiceImpl extends ServiceImpl<UmsUserLoginLogDao, UmsUserLoginLogEntity> implements UmsUserLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsUserLoginLogEntity> page = this.page(
                new Query<UmsUserLoginLogEntity>().getPage(params),
                new QueryWrapper<UmsUserLoginLogEntity>()
        );

        return new PageUtils(page);
    }

}