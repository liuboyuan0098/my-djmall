package com.qz.djmall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.user.dao.UmsUserCollectSubjectDao;
import com.qz.djmall.user.entity.UmsUserCollectSubjectEntity;
import com.qz.djmall.user.service.UmsUserCollectSubjectService;


@Service("umsUserCollectSubjectService")
public class UmsUserCollectSubjectServiceImpl extends ServiceImpl<UmsUserCollectSubjectDao, UmsUserCollectSubjectEntity> implements UmsUserCollectSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsUserCollectSubjectEntity> page = this.page(
                new Query<UmsUserCollectSubjectEntity>().getPage(params),
                new QueryWrapper<UmsUserCollectSubjectEntity>()
        );

        return new PageUtils(page);
    }

}