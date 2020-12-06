package com.qz.djmall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.user.dao.UmsUserDao;
import com.qz.djmall.user.entity.UmsUserEntity;
import com.qz.djmall.user.service.UmsUserService;


@Service("umsUserService")
public class UmsUserServiceImpl extends ServiceImpl<UmsUserDao, UmsUserEntity> implements UmsUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsUserEntity> page = this.page(
                new Query<UmsUserEntity>().getPage(params),
                new QueryWrapper<UmsUserEntity>()
        );

        return new PageUtils(page);
    }

}