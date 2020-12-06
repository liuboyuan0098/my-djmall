package com.qz.djmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.ware.entity.WmsWareOrderBillDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 16:58:56
 */
public interface WmsWareOrderBillDetailService extends IService<WmsWareOrderBillDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

