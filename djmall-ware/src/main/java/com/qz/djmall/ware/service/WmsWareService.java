package com.qz.djmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.ware.entity.WmsWareEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 16:58:56
 */
public interface WmsWareService extends IService<WmsWareEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

