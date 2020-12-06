package com.qz.djmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.product.entity.PmsSpuDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
public interface PmsSpuDescService extends IService<PmsSpuDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

