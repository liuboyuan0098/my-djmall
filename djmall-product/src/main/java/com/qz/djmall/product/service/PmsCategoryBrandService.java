package com.qz.djmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.product.entity.PmsCategoryBrandEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
public interface PmsCategoryBrandService extends IService<PmsCategoryBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

