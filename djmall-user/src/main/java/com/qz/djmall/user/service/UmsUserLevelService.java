package com.qz.djmall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.user.entity.UmsUserLevelEntity;

import java.util.Map;

/**
 * 会员等级表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
public interface UmsUserLevelService extends IService<UmsUserLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

