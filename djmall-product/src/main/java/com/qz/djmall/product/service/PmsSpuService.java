package com.qz.djmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.product.entity.PmsSpuEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
public interface PmsSpuService extends IService<PmsSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

