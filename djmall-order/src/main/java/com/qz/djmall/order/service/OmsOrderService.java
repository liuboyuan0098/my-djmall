package com.qz.djmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.order.entity.OmsOrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 16:59:55
 */
public interface OmsOrderService extends IService<OmsOrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

