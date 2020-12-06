package com.qz.djmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.product.entity.PmsSkuEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
public interface PmsSkuService extends IService<PmsSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

