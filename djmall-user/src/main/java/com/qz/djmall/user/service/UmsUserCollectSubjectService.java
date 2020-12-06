package com.qz.djmall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.user.entity.UmsUserCollectSubjectEntity;

import java.util.Map;

/**
 * 关注活动表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
public interface UmsUserCollectSubjectService extends IService<UmsUserCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

