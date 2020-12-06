package com.qz.djmall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.Query;

import com.qz.djmall.ware.dao.WmsWareOrderBillDetailDao;
import com.qz.djmall.ware.entity.WmsWareOrderBillDetailEntity;
import com.qz.djmall.ware.service.WmsWareOrderBillDetailService;


@Service("wmsWareOrderBillDetailService")
public class WmsWareOrderBillDetailServiceImpl extends ServiceImpl<WmsWareOrderBillDetailDao, WmsWareOrderBillDetailEntity> implements WmsWareOrderBillDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsWareOrderBillDetailEntity> page = this.page(
                new Query<WmsWareOrderBillDetailEntity>().getPage(params),
                new QueryWrapper<WmsWareOrderBillDetailEntity>()
        );

        return new PageUtils(page);
    }

}