package com.qz.djmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.product.entity.PmsCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
public interface PmsCommentService extends IService<PmsCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

