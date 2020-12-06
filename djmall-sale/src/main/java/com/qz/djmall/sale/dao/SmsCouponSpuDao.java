package com.qz.djmall.sale.dao;

import com.qz.djmall.sale.entity.SmsCouponSpuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 17:00:56
 */
@Mapper
public interface SmsCouponSpuDao extends BaseMapper<SmsCouponSpuEntity> {
	
}
