package com.qz.djmall.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.sale.entity.SmsSkuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 17:00:56
 */
public interface SmsSkuBoundsService extends IService<SmsSkuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

