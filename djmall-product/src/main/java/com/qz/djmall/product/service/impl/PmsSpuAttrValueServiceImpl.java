package com.qz.djmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.product.dao.PmsSpuAttrValueDao;
import com.qz.djmall.product.entity.PmsSpuAttrValueEntity;
import com.qz.djmall.product.service.PmsSpuAttrValueService;


@Service("pmsSpuAttrValueService")
public class PmsSpuAttrValueServiceImpl extends ServiceImpl<PmsSpuAttrValueDao, PmsSpuAttrValueEntity> implements PmsSpuAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuAttrValueEntity> page = this.page(
                new Query<PmsSpuAttrValueEntity>().getPage(params),
                new QueryWrapper<PmsSpuAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}