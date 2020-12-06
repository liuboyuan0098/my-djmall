package com.qz.djmall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.ware.dao.WmsWareDao;
import com.qz.djmall.ware.entity.WmsWareEntity;
import com.qz.djmall.ware.service.WmsWareService;


@Service("wmsWareService")
public class WmsWareServiceImpl extends ServiceImpl<WmsWareDao, WmsWareEntity> implements WmsWareService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsWareEntity> page = this.page(
                new Query<WmsWareEntity>().getPage(params),
                new QueryWrapper<WmsWareEntity>()
        );

        return new PageUtils(page);
    }

}