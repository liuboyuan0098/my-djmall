package com.qz.djmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.product.dao.PmsCommentDao;
import com.qz.djmall.product.entity.PmsCommentEntity;
import com.qz.djmall.product.service.PmsCommentService;


@Service("pmsCommentService")
public class PmsCommentServiceImpl extends ServiceImpl<PmsCommentDao, PmsCommentEntity> implements PmsCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCommentEntity> page = this.page(
                new Query<PmsCommentEntity>().getPage(params),
                new QueryWrapper<PmsCommentEntity>()
        );

        return new PageUtils(page);
    }

}