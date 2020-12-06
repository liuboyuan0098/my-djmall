package com.qz.djmall.sale.dao;

import com.qz.djmall.sale.entity.SmsSeckillSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * 
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 17:00:56
 */
@Mapper
public interface SmsSeckillSkuDao extends BaseMapper<SmsSeckillSkuEntity> {
	
}
