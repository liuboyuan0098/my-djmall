package com.qz.djmall.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.sale.entity.SmsCouponSpuCategoryEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 17:00:55
 */
public interface SmsCouponSpuCategoryService extends IService<SmsCouponSpuCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

