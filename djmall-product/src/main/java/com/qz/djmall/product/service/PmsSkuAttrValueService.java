package com.qz.djmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.product.entity.PmsSkuAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:08
 */
public interface PmsSkuAttrValueService extends IService<PmsSkuAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

