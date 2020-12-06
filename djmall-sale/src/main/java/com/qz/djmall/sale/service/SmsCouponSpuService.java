package com.qz.djmall.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.sale.entity.SmsCouponSpuEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 17:00:56
 */
public interface SmsCouponSpuService extends IService<SmsCouponSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

