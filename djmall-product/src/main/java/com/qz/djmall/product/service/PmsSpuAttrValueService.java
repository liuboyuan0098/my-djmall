package com.qz.djmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.product.entity.PmsSpuAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
public interface PmsSpuAttrValueService extends IService<PmsSpuAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

