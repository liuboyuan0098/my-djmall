package com.qz.djmall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.user.entity.UmsGrowthHistoryEntity;

import java.util.Map;

/**
 * 成长积分记录表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
public interface UmsGrowthHistoryService extends IService<UmsGrowthHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

