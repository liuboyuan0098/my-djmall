package com.qz.djmall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.user.dao.UmsUserAddressDao;
import com.qz.djmall.user.entity.UmsUserAddressEntity;
import com.qz.djmall.user.service.UmsUserAddressService;


@Service("umsUserAddressService")
public class UmsUserAddressServiceImpl extends ServiceImpl<UmsUserAddressDao, UmsUserAddressEntity> implements UmsUserAddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsUserAddressEntity> page = this.page(
                new Query<UmsUserAddressEntity>().getPage(params),
                new QueryWrapper<UmsUserAddressEntity>()
        );

        return new PageUtils(page);
    }

}