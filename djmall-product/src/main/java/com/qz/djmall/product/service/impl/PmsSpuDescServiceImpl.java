package com.qz.djmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.product.dao.PmsSpuDescDao;
import com.qz.djmall.product.entity.PmsSpuDescEntity;
import com.qz.djmall.product.service.PmsSpuDescService;


@Service("pmsSpuDescService")
public class PmsSpuDescServiceImpl extends ServiceImpl<PmsSpuDescDao, PmsSpuDescEntity> implements PmsSpuDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuDescEntity> page = this.page(
                new Query<PmsSpuDescEntity>().getPage(params),
                new QueryWrapper<PmsSpuDescEntity>()
        );

        return new PageUtils(page);
    }

}