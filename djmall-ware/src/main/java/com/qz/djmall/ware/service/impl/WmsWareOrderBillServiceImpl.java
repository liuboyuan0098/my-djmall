package com.qz.djmall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.ware.dao.WmsWareOrderBillDao;
import com.qz.djmall.ware.entity.WmsWareOrderBillEntity;
import com.qz.djmall.ware.service.WmsWareOrderBillService;


@Service("wmsWareOrderBillService")
public class WmsWareOrderBillServiceImpl extends ServiceImpl<WmsWareOrderBillDao, WmsWareOrderBillEntity> implements WmsWareOrderBillService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsWareOrderBillEntity> page = this.page(
                new Query<WmsWareOrderBillEntity>().getPage(params),
                new QueryWrapper<WmsWareOrderBillEntity>()
        );

        return new PageUtils(page);
    }

}